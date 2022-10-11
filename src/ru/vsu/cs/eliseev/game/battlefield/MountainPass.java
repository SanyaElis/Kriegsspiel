package ru.vsu.cs.eliseev.game.battlefield;


public class MountainPass extends Cell implements Printable {

    private static final int DefaultDefenceBonus = 2;

    public MountainPass() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        if (warrior == null)
            return  "⇔";
        else return warrior.print() + "⇔";
    }


}
