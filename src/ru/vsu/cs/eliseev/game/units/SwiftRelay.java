package ru.vsu.cs.eliseev.game.units;

public class SwiftRelay extends Warrior{
    private static final int DefaultSpeed = 2;
    private static final int DefaultRange = 0;
    private static final int DefaultAttack = 0;
    private static final int DefaultDefence = 1;

    public SwiftRelay(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

    @Override
    public String print() {
        return " \uD83D\uDCE8";
    }
}
