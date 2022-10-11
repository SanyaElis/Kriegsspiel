package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.units.*;
import ru.vsu.cs.eliseev.game.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Initialization {

    private static List<Warrior> troops = new ArrayList<>(15);

    private static List<Warrior> firstPlayer() {

        try {
            troops = Utils.readWarriorsFromFile("textfiles/player1.txt");
        } catch (Exception e) {
            System.err.println("Error");
        }

        return troops;
    }

    private static List<Warrior> secondPlayer() {

        try {
            troops = Utils.readWarriorsFromFile("textfiles/player2.txt");
        } catch (Exception e) {
            System.err.println("Error");
        }

        return troops;
    }

    public static List<Warrior> initialization(PlayerNumber playerNumber) {

        if (playerNumber.equals(PlayerNumber.P1)) {
            return firstPlayer();
        } else {
            return secondPlayer();
        }

    }
}
