package ru.vsu.cs.eliseev.game.battlefield;

public class Fortress extends Cell implements Printable {

    private static final int DefaultDefenceBonus = 4;

    public Fortress() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        if (warrior == null)
            return "\uD83C\uDFF0";
        else return warrior.print() + "\uD83C\uDFF0";
    }
}
