package ru.vsu.cs.eliseev.game.units;

import ru.vsu.cs.eliseev.game.battlefield.Printable;

public abstract class Warrior implements Moving, Printable {
    protected Position position;
    protected int speed;
    protected int range;
    protected int attack;
    protected int defence;

    public Position getPosition() {
        return position;
    }
    @Override
    public boolean move(Position pos) {
        return false;
    }

    protected Warrior(Position position, int speed, int range, int attack, int defence) {
        this.position = position;
        this.speed = speed;
        this.range = range;
        this.attack = attack;
        this.defence = defence;
    }
}
