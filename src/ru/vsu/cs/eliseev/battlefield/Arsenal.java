package ru.vsu.cs.eliseev.battlefield;

public class Arsenal extends Cell implements Print{//todo научится отличать чей арсенал
    //private static final int numOfPlayer;
    private static final int DefaultDefenceBonus = 0;

    public Arsenal() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public void print() {
        if (warrior == null)
            System.out.print("⚑");
        else warrior.print();
    }
}
