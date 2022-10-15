package ru.vsu.cs.eliseev.game.battlefield;


import ru.vsu.cs.eliseev.game.draw.DrawField;

public class Arsenal extends Cell  {
    private static final int DefaultDefenceBonus = 0;

    public Arsenal() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public String print() {
        return DrawField.drawOnConsole(this);
    }
}
