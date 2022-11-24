package ru.vsu.cs.eliseev.game.units;

public interface Moving {
    /**
     *
     * @param pos
     * @ moves the unit to a position if it is impossible returns false
     */
    void move(Position pos);
}
