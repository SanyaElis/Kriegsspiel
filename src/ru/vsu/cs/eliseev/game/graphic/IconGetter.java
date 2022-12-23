package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.units.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class IconGetter {
    private Map<Class<? extends Cell>, Icon> cellDrawer = new HashMap<>();
    private Map<Class<? extends Warrior>, Icon> warriorDrawer = new HashMap<>();
    private final Icon ground = new ImageIcon("pictures/groung.jpg");
    private final Icon mountain = new ImageIcon("pictures/peaks.png");
    private final Icon mountainPass = new ImageIcon("pictures/mountain-road.png");
    private final Icon arsenal = new ImageIcon("pictures/medieval-pavilion.png");
    private final Icon fortress = new ImageIcon("pictures/white-tower.png");
    private final Icon cannon = new ImageIcon("pictures/cannon.png");
    private final Icon swiftCannon = new ImageIcon("pictures/human-cannonball.png");
    private final Icon cavalry = new ImageIcon("pictures/cavalry.png");
    private final Icon infantry = new ImageIcon("pictures/pikeman.png");
    private final Icon relay = new ImageIcon("pictures/mountain-road.png");
    private final Icon swiftRelay = new ImageIcon("pictures/raven.png");

    public IconGetter() {
        cellDrawer.put(Ground.class, ground);
        cellDrawer.put(Mountain.class, mountain);
        cellDrawer.put(MountainPass.class, mountainPass);
        cellDrawer.put(Fortress.class, fortress);
        cellDrawer.put(Arsenal.class, arsenal);
        warriorDrawer.put(Cannon.class, cannon);
        warriorDrawer.put(SwiftCannon.class, swiftCannon);
        warriorDrawer.put(Cavalry.class, cavalry);
        warriorDrawer.put(Infantry.class, infantry);
        warriorDrawer.put(Relay.class, relay);
        warriorDrawer.put(SwiftRelay.class, swiftRelay);
    }

    public Map<Class<? extends Cell>, Icon> getIconsForCell() {
        return cellDrawer;
    }

    public Map<Class<? extends Warrior>, Icon> getIconsForWarrior() {
        return warriorDrawer;
    }
}
