package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.units.Position;

public class Ground extends Cell {

    private static final int DefaultDefenceBonus = 0;

    public Ground(Position position) {
        super(true, DefaultDefenceBonus, null, position);
    }

}
