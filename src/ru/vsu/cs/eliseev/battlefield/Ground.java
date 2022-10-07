package ru.vsu.cs.eliseev.battlefield;

public class Ground extends Cell implements Print{

    private static final int DefaultDefenceBonus = 0;

    public Ground() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public void print() {
        if (warrior == null)
            System.out.print(".");
        else warrior.print();
    }
}
