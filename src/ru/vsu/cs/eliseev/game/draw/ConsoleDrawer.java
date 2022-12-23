package ru.vsu.cs.eliseev.game.draw;

import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.units.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConsoleDrawer {

    private Map<Class<? extends Cell>, String> cellDrawer = new HashMap<>();
    private Map<Class<? extends Warrior>, String> warriorDrawer = new HashMap<>();

    public ConsoleDrawer() {
        cellDrawer.put(Ground.class, "_");
        cellDrawer.put(Mountain.class, "⛰");
        cellDrawer.put(MountainPass.class, "⇔");
        cellDrawer.put(Fortress.class, "\uD83C\uDFF0");
        cellDrawer.put(Arsenal.class, "⚑");
        warriorDrawer.put(Cannon.class, "\uD83D\uDC27");
        warriorDrawer.put(SwiftCannon.class, "\uD83D\uDCEE");
        warriorDrawer.put(Cavalry.class, "\uD83D\uDC0E");
        warriorDrawer.put(Infantry.class, "⚔");
        warriorDrawer.put(Relay.class, "\uD83D\uDCEE");
        warriorDrawer.put(SwiftRelay.class, "\uD83D\uDCE8");
    }

    public Map<Class<? extends Cell>, String> getIconsForCell() {
        return cellDrawer;
    }

    public Map<Class<? extends Warrior>, String> getIconsForWarrior() {
        return warriorDrawer;
    }
}
