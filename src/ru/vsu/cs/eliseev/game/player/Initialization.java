package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.units.*;

import java.util.ArrayList;
import java.util.List;

public class Initialization {

    private static List<Warrior> troops = new ArrayList<>(15);

    private static List<Warrior> firstPlayer() {

        Cannon cannon = new Cannon(new Position(7, 6));

        SwiftCannon swiftCannon = new SwiftCannon(new Position(5, 7));

        Cavalry cavalry1 = new Cavalry(new Position(2, 6));
        Cavalry cavalry2 = new Cavalry(new Position(3, 6));
        Cavalry cavalry3 = new Cavalry(new Position(2, 7));
        Cavalry cavalry4 = new Cavalry(new Position(3, 7));

        Infantry infantry1 = new Infantry(new Position(4, 7));
        Infantry infantry2 = new Infantry(new Position(5, 6));
        Infantry infantry3 = new Infantry(new Position(6, 6));
        Infantry infantry4 = new Infantry(new Position(5, 8));
        Infantry infantry5 = new Infantry(new Position(6, 7));
        Infantry infantry6 = new Infantry(new Position(7, 7));
        Infantry infantry7 = new Infantry(new Position(8, 7));
        Infantry infantry8 = new Infantry(new Position(8, 6));
        Infantry infantry9 = new Infantry(new Position(9, 5));

        return getWarriors(cannon, swiftCannon, cavalry1, cavalry2, cavalry3, cavalry4, infantry1, infantry2, infantry3, infantry4, infantry5, infantry6, infantry7, infantry8, infantry9);
    }

    private static List<Warrior> secondPlayer() {

        Cannon cannon = new Cannon(new Position(17, 10));

        SwiftCannon swiftCannon = new SwiftCannon(new Position(15, 14));

        Cavalry cavalry1 = new Cavalry(new Position(18, 10));
        Cavalry cavalry2 = new Cavalry(new Position(18, 11));
        Cavalry cavalry3 = new Cavalry(new Position(17, 11));
        Cavalry cavalry4 = new Cavalry(new Position(17, 12));

        Infantry infantry1 = new Infantry(new Position(14, 10));
        Infantry infantry2 = new Infantry(new Position(15, 10));
        Infantry infantry3 = new Infantry(new Position(16, 10));
        Infantry infantry4 = new Infantry(new Position(14, 11));
        Infantry infantry5 = new Infantry(new Position(15, 11));
        Infantry infantry6 = new Infantry(new Position(16, 11));
        Infantry infantry7 = new Infantry(new Position(14, 12));
        Infantry infantry8 = new Infantry(new Position(15, 12));
        Infantry infantry9 = new Infantry(new Position(16, 12));

        return getWarriors(cannon, swiftCannon, cavalry1, cavalry2, cavalry3, cavalry4, infantry1, infantry2, infantry3, infantry4, infantry5, infantry6, infantry7, infantry8, infantry9);
    }

    private static List<Warrior> getWarriors(Cannon cannon, SwiftCannon swiftCannon, Cavalry cavalry1, Cavalry cavalry2, Cavalry cavalry3, Cavalry cavalry4, Infantry infantry1, Infantry infantry2, Infantry infantry3, Infantry infantry4, Infantry infantry5, Infantry infantry6, Infantry infantry7, Infantry infantry8, Infantry infantry9) {
        troops.add(cavalry1);
        troops.add(cavalry2);
        troops.add(cavalry3);
        troops.add(cavalry4);
        troops.add(infantry1);
        troops.add(infantry2);
        troops.add(infantry3);
        troops.add(infantry4);
        troops.add(infantry5);
        troops.add(infantry6);
        troops.add(infantry7);
        troops.add(infantry8);
        troops.add(infantry9);
        troops.add(cannon);
        troops.add(swiftCannon);

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
