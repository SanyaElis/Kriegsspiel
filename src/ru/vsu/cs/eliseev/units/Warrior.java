package ru.vsu.cs.eliseev.units;

import ru.vsu.cs.eliseev.battlefield.Print;

public abstract class Warrior implements Movement, Print {
    protected Position position;
    protected int speed;
    protected int range;
    protected int attack;
    protected int defence;

    public Position getPosition() {
        return position;
    }

    public Warrior(Position position, int speed, int range, int attack, int defence) {
        this.position = position;
        this.speed = speed;
        this.range = range;
        this.attack = attack;
        this.defence = defence;
    }
}
