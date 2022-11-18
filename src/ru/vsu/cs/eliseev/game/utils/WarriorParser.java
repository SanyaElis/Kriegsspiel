package ru.vsu.cs.eliseev.game.utils;

import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.units.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarriorParser {//todo переименовать, сделать не статическим
    /**
     * Чтение всего текстового файла в массив строк
     */
    public static String[] readLinesFromFile(String fileName) throws FileNotFoundException {
        //todo Files.readAllLines(fileName);
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
            lines = new ArrayList<>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        }
        return lines.toArray(new String[0]);
    }

    public static Player readWarriorsFromFile(String fileName) throws FileNotFoundException {
        List <Warrior> troops = new ArrayList<>();
        String[] str = readLinesFromFile(fileName);
        Position[] positionsOfArsenal = new Position[2];
        List<Warrior> relays = new ArrayList<>();
        for (String s : str) {
            String[] string = s.split("\\s+");
            switch (string[0]) {
                case ("Cannon"):
                    for (int j = 1; j < string.length; j++) {
                        troops.add(new Cannon(Position.fromSting(string[j])));
                    }
                    break;
                case ("SwiftCannon"):
                    for (int j = 1; j < string.length; j++) {
                        troops.add(new SwiftCannon(Position.fromSting(string[j])));
                    }
                    break;
                case ("Infantry"):
                    for (int j = 1; j < string.length; j++) {
                        troops.add(new Infantry(Position.fromSting(string[j])));
                    }
                    break;
                case ("Cavalry"):
                    for (int j = 1; j < string.length; j++) {
                        troops.add(new Cavalry(Position.fromSting(string[j])));
                    }
                    break;
                case ("Relay"):
                    for (int j = 1; j < string.length; j++) {
                        Warrior relay = new Relay(Position.fromSting(string[j]));
                        troops.add(relay);
                        relays.add(relay);
                    }
                    break;
                case ("SwiftRelay"):
                    for (int j = 1; j < string.length; j++) {
                        Warrior swiftRelay = new SwiftRelay(Position.fromSting(string[j]));
                        troops.add(swiftRelay);
                        relays.add(swiftRelay);
                    }
                    break;
                case ("Arsenal"):
                    for (int j = 1; j < string.length; j++) {
                        positionsOfArsenal[j - 1] = Position.fromSting(string[j]);
                    }
            }
        }
        Player player = new Player(troops, positionsOfArsenal);
        player.setRelay(relays);
        return player;
    }
}
