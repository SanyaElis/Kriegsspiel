package ru.vsu.cs.eliseev.units;

public interface Movement {
    /**
     *
     * @param pos
     * @ moves the unit to a position if it is impossible returns false
     */
    boolean move(Position pos);
}
