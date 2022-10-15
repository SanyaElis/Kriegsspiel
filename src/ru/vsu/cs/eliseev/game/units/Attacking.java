package ru.vsu.cs.eliseev.game.units;

public interface Attacking {
    /**
     *
     * @param pos
     * @return true if kill someone
     */
    boolean attack(Position pos);
}
