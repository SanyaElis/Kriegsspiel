package ru.vsu.cs.eliseev.game.units;

public class Relay extends Warrior {

    private static final int DefaultSpeed = 1;
    private static final int DefaultRange = 0;
    private static final int DefaultAttack = 0;
    private static final int DefaultDefence = 1;

    public Relay(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

    @Override
    public String print() {
        return "\uD83D\uDCEE";
    }
}
