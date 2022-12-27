package ru.vsu.cs.eliseev.game;

import ru.vsu.cs.eliseev.game.console.ConsoleAPI;
import ru.vsu.cs.eliseev.game.console.ConsolePlayer;
import ru.vsu.cs.eliseev.game.game.Game;
import ru.vsu.cs.eliseev.game.graphic.GraphicAPI;
import ru.vsu.cs.eliseev.game.player.Bot;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new ConsoleAPI(), new ConsolePlayer());
        game.startPlay();

//        Game game = new Game(new GraphicAPI());
//        game.startPlay();
        //ConsoleGame game = new ConsoleGame();
//        ConsoleGame.startGame();
    }
}
