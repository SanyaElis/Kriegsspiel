package ru.vsu.cs.eliseev.game.battlefield;

public class Ground extends Cell implements Printable {

    private static final int DefaultDefenceBonus = 0;

    public Ground() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        if (warrior == null)
            return "_";
        else return warrior.print();
    }
}
