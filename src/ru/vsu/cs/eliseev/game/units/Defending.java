package ru.vsu.cs.eliseev.game.units;

public interface Defending {
    /**
     *
     * @param pos
     * @return возвращает число очков защиты
     */
    int defence(Position pos);
}
