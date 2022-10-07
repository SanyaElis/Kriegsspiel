package ru.vsu.cs.eliseev.battlefield;


public class MountainPass extends Cell implements Print {

    private static final int DefaultDefenceBonus = 2;

    public MountainPass() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public void print() {
        if (warrior == null)
            System.out.print("⇔");
        else warrior.print();
    }
}
