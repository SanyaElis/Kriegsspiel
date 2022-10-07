package ru.vsu.cs.eliseev.units;

import ru.vsu.cs.eliseev.battlefield.Print;

public class Cavalry extends Warrior implements Movement, Print {

    private static final int DefaultSpeed = 2;
    private static final int DefaultRange = 2;
    private static final int DefaultAttack = 4;
    private static final int DefaultDefence = 5;

    public Cavalry(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

    @Override
    public boolean move(Position pos) {

        return false;
    }

    @Override
    public void print() {
        System.out.print("\uD83D\uDC0E");
    }
}
