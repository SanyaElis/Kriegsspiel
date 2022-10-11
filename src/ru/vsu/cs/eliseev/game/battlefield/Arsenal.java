package ru.vsu.cs.eliseev.game.battlefield;

public class Arsenal extends Cell implements Printable {//todo научится отличать чей арсенал
    // игрок будет знать его арсенал
    private static final int DefaultDefenceBonus = 0;

    public Arsenal() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        if (warrior == null)
            return "⚑";
        else return warrior.print() + "⚑";
    }
}
