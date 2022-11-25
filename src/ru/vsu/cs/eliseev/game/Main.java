package ru.vsu.cs.eliseev.game;

import ru.vsu.cs.eliseev.game.console.ConsoleAPI;
import ru.vsu.cs.eliseev.game.console.ConsoleGame;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.game.Game;
import ru.vsu.cs.eliseev.game.graphic.GraphicAPI;
import ru.vsu.cs.eliseev.game.graphic.GraphicApp;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(new GraphicAPI());
        game.startPlay();
//        ConsoleGame.startGame();
//        JFrame frame = new GraphicApp(new Battlefield());
//        frame.setVisible(true);
    }
}
