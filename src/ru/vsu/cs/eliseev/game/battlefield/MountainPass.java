package ru.vsu.cs.eliseev.game.battlefield;

import ru.vsu.cs.eliseev.game.units.Position;

public class MountainPass extends Cell  {

    private static final int DefaultDefenceBonus = 2;

    public MountainPass(Position position) {
        super(true, DefaultDefenceBonus, null, position);
    }

}
