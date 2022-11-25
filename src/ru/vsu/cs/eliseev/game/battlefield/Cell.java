package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

public abstract class Cell  {//todo рисовку отдельно от этого класса или проще засунуть сюда

    protected boolean patency;
    protected int defenceBonus;
    protected Warrior warrior;
    protected Position position;

    public Cell(boolean patency, int defenceBonus, Warrior warrior, Position position) {
        this.patency = patency;
        this.defenceBonus = defenceBonus;
        this.warrior = warrior;
        this.position = position;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public boolean isPatency() {//&& warrior != null
        return patency;
    }

    public Position getPosition(){
        return position;
    }

    abstract public void draw(DrawingCell dc);
}
