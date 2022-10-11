package ru.vsu.cs.eliseev.game.units;

import ru.vsu.cs.eliseev.game.battlefield.Printable;

public class Cannon extends Warrior implements Moving, Printable {

    private static final int DefaultSpeed = 1;
    private static final int DefaultRange = 3;
    private static final int DefaultAttack = 5;
    private static final int DefaultDefence = 8;

    public Cannon(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

//    @Override
//    public boolean move(Position pos) {
//        return false;
//    }

    @Override
    public String print() {
        return "\uD83D\uDC27";
    }
}
