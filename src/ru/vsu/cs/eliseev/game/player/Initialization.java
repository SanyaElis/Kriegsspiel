package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.utils.WarriorParser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Initialization {

    private static final List<Player> players = new ArrayList<>();
    private static final Path p1 = Paths.get("textfiles/player1.txt");
    private static final Path p2 = Paths.get("textfiles/player2.txt");

    public static List<Player> initialization() {
        try {
            WarriorParser wp = new WarriorParser();
            players.add(wp.readWarriorsFromFile(p1));
            players.add(wp.readWarriorsFromFile(p2));
        } catch (Exception e) {
            System.err.println("Error reading from file");
        }
        return players;
    }
}
