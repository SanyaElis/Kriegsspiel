package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.units.Drawable;
import ru.vsu.cs.eliseev.game.units.Warrior;

public abstract class Cell implements Drawable {

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

    public Warrior getWarrior() {
        return warrior;
    }

    public boolean isPatency() {
        return patency;
    }
}
