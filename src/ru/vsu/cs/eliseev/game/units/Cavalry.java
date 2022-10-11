package ru.vsu.cs.eliseev.game.units;

import ru.vsu.cs.eliseev.game.battlefield.Printable;

public class Cavalry extends Warrior implements Moving, Printable {

    private static final int DefaultSpeed = 2;
    private static final int DefaultRange = 2;
    private static final int DefaultAttack = 4;
    private static final int DefaultDefence = 5;

    public Cavalry(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }


    @Override
    public String print() {
        return "\uD83D\uDC0E";
    }
}
