package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class GameMapGenerator {
    private static final int currentSize = 10;

    public static List<List<Character>> generateMap() {
        List<Character> oneLine = Stream.generate(() -> '.')
                .limit(currentSize)
                .collect(Collectors.toList());
        return new ArrayList<>(Collections.nCopies(currentSize, oneLine));
    }
}
