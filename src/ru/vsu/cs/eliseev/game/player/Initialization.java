package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Initialization {

    private static final List<Player> players = new ArrayList<>();

    public static List<Player> initialization() {
        try {
            players.add(Utils.readWarriorsFromFile("textfiles/player1.txt"));
            players.add(Utils.readWarriorsFromFile("textfiles/player2.txt"));
        } catch (Exception e) {
            System.err.println("Error reading from file");
        }
        return players;
    }
}
