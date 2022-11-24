package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.draw.ConsoleDraw;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;

public class Fortress extends Cell  {

    private static final int DefaultDefenceBonus = 4;

    public Fortress() {
        super(true, DefaultDefenceBonus, null);
    }

    @Override
    public void draw(DrawingCell dc) {
        dc.draw(this);
    }
}
