package ru.vsu.cs.eliseev.game.units;

public class Infantry extends Warrior {

    private static final int DefaultSpeed = 1;
    private static final int DefaultRange = 2;
    private static final int DefaultAttack = 4;
    private static final int DefaultDefence = 6;

    public Infantry(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

}
