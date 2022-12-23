package ru.vsu.cs.eliseev.game.battlefield;


import ru.vsu.cs.eliseev.game.units.Position;

public class Mountain extends Cell {

    private static final int DefaultDefenceBonus = 0;

    public Mountain(Position position) {
        super(false, DefaultDefenceBonus, null, position);
    }

}
