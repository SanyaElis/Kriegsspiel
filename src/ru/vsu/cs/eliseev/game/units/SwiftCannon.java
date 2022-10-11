package ru.vsu.cs.eliseev.game.units;

public class SwiftCannon extends Warrior  {

    private static final int DefaultSpeed = 2;
    private static final int DefaultRange = 3;
    private static final int DefaultAttack = 5;
    private static final int DefaultDefence = 8;

    public SwiftCannon(Position position) {
        super(position, DefaultSpeed, DefaultRange, DefaultAttack, DefaultDefence);
    }

//    @Override
//    public boolean move(Position pos) {
//        return false;
//    }

    @Override
    public String print() {
       return "\uD83D\uDD2B";
    }
}
