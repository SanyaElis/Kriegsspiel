package ru.vsu.cs.eliseev.game.draw;

import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.units.*;

public class ConsoleDraw implements DrawingCell, DrawingWarrior {//todo разбить на классы

    public ConsoleDraw() {
    }

    @Override
    public void draw(Arsenal arsenal) {
        if (arsenal.getWarrior() == null)
            System.out.format("%3s", "  ⚑");//⚑
        else {
            System.out.format("%3s", "⚑");
            arsenal.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Fortress fortress) {
        if (fortress.getWarrior() == null)
            System.out.format("%3s", "  \uD83C\uDFF0");//🏰
        else {
            System.out.format("%3s", "\uD83C\uDFF0");
            fortress.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Ground ground) {
        if (ground.getWarrior() == null)
            System.out.format("%3s", "_");
        else {
            System.out.format("%2s", " ");
            ground.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Mountain mountain) {
        System.out.format("%3s", "  ⛰");//⛰
    }

    @Override
    public void draw(MountainPass mountainPass) {
        if (mountainPass.getWarrior() == null)
            System.out.format("%3s", "  ⇔");//⇔
        else {
            System.out.format("%3s", "⇔");
            mountainPass.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Cannon cannon) {
        System.out.print("\uD83D\uDC27");
    }

    @Override
    public void draw(SwiftRelay swiftRelay) {
        System.out.print("\uD83D\uDCE8");
    }

    @Override
    public void draw(Cavalry cavalry) {
        System.out.print("\uD83D\uDC0E");
    }

    @Override
    public void draw(Infantry infantry) {
        System.out.print("⚔");
    }

    @Override
    public void draw(Relay relay) {
        System.out.print("\uD83D\uDCEE");
    }

    @Override
    public void draw(SwiftCannon swiftCannon) {
        System.out.print("\uD83D\uDCEE");
    }
}
