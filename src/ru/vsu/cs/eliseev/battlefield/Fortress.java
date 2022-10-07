package ru.vsu.cs.eliseev.battlefield;

public class Fortress extends Cell implements Print {

    private static final int DefaultDefenceBonus = 4;

    public Fortress() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public void print() {
        if (warrior == null)
            System.out.print("\uD83C\uDFF0");
        else warrior.print();
    }
}
