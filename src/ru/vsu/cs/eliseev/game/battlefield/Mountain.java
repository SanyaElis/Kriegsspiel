package ru.vsu.cs.eliseev.game.battlefield;


public class Mountain extends Cell implements Printable {

    private static final int DefaultDefenceBonus = 0;

    public Mountain() {
        super(false, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        if (warrior == null)
            return  "⛰";
        else return warrior.print();
    }
}
