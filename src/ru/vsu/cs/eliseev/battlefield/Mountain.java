package ru.vsu.cs.eliseev.battlefield;


public class Mountain extends Cell implements Print{

    private static final int DefaultDefenceBonus = 0;

    public Mountain() {
        super(false, DefaultDefenceBonus, null);
    }

    @Override
    public void print() {
        if (warrior == null)
            System.out.print("⛰");
        else warrior.print();
    }
}
