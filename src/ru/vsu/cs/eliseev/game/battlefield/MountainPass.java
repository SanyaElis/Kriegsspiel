package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.draw.ConsoleDraw;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.units.Position;

public class MountainPass extends Cell  {

    private static final int DefaultDefenceBonus = 2;

    public MountainPass(Position position) {
        super(true, DefaultDefenceBonus, null, position);
    }

    @Override
    public void draw(DrawingCell dc) {
        dc.draw(this);
    }
}
