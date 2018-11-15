package map;

import util.GameMapGenerator;

import java.util.List;

public class GameMap {
    private List<List<Character>> map;

    public GameMap() {
        this.map = GameMapGenerator.generateMap();
    }

    public List<List<Character>> getMap() {
        return map;
    }

    public void showMap() {
        map.forEach((lane) -> {
            lane.forEach(System.out::print);
            System.out.println();
        });
    }
}
