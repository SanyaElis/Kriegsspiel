package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.draw.DrawField;

public class MountainPass extends Cell  {

    private static final int DefaultDefenceBonus = 2;

    public MountainPass() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        return DrawField.drawOnConsole(this);
    }
}
