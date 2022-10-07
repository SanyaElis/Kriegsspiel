package ru.vsu.cs.eliseev.battlefield;

import ru.vsu.cs.eliseev.units.Warrior;

public abstract class Cell implements Print{

    protected boolean patency;//проходимость
    protected int defenceBonus;
    protected Warrior warrior;//тот кто сидит на клетке

    public Cell(boolean patency, int defenceBonus, Warrior warrior) {
        this.patency = patency;
        this.defenceBonus = defenceBonus;
        this.warrior = warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}
