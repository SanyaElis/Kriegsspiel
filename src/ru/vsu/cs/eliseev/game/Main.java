package ru.vsu.cs.eliseev.game;

import ru.vsu.cs.eliseev.game.console.ConsoleGame;
import ru.vsu.cs.eliseev.game.utils.Utils;

public class Main {

    public static void main(String[] args) {
        ConsoleGame.startGame();
        try {
            Utils.readWarriorsFromFile("textfiles/player1.txt");
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
