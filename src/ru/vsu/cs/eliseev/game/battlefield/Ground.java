package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.draw.DrawField;

public class Ground extends Cell {

    private static final int DefaultDefenceBonus = 0;

    public Ground() {
        super(true, DefaultDefenceBonus, null);
    }
    @Override
    public String print() {
        return DrawField.drawOnConsole(this);
    }
}
