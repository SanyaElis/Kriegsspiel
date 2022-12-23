package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.units.Position;

public class Fortress extends Cell  {

    private static final int DefaultDefenceBonus = 4;

    public Fortress(Position position) {
        super(true, DefaultDefenceBonus, null, position);
    }

}
