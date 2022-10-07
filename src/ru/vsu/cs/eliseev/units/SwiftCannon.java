package ru.vsu.cs.eliseev.units;

import ru.vsu.cs.eliseev.battlefield.Print;

public class SwiftCannon extends Warrior implements Movement, Print {

    private static final int DefaultSpeed = 2;
    private static final int DefaultRange = 3;
    private static final int DefaultAttack = 5;
    private static final int DefaultDefence = 8;

    public SwiftCannon(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

    @Override
    public boolean move(Position pos) {
        return false;
    }

    @Override
    public void print() {
        System.out.print("\uD83D\uDD2B");
    }
}
