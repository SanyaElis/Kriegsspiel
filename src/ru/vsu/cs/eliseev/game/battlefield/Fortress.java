package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.draw.DrawField;

public class Fortress extends Cell  {

    private static final int DefaultDefenceBonus = 4;

    public Fortress() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        return DrawField.drawOnConsole(this);
    }
}
