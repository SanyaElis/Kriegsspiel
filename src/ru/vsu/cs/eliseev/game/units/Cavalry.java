package ru.vsu.cs.eliseev.game.units;

public class Cavalry extends Warrior implements Moving, Drawable {

    private static final int DefaultSpeed = 2;
    private static final int DefaultRange = 2;
    private static final int DefaultAttack = 4;
    private static final int DefaultDefence = 5;

    public Cavalry(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }


    @Override
    public String print() {
        return " \uD83D\uDC0E";
    }
}
