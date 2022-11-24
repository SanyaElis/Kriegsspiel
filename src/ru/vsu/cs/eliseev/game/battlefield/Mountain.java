package ru.vsu.cs.eliseev.game.battlefield;


import ru.vsu.cs.eliseev.game.draw.ConsoleDraw;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;

public class Mountain extends Cell {

    private static final int DefaultDefenceBonus = 0;

    public Mountain() {
        super(false, DefaultDefenceBonus, null);
    }

    @Override
    public void draw(DrawingCell dc) {
        dc.draw(this);
    }
}
