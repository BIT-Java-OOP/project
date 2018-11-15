import map.GameMap;
import player.Player;

public class Main {
    public static void main(String[] args) {
        Game.play(new GameMap(), new Player("Marcin"));
    }
}
