package ru.vsu.cs.eliseev.game.units;


public abstract class Warrior implements Moving {
    protected Position position;
    protected int speed;
    protected int range;
    protected int attack;
    protected int defence;

    public Position getPosition() {
        return position;
    }

    @Override
    public void move(Position pos) {
        position = pos;
    }

    public boolean canReach(Position pos) {
        return Math.abs(position.getY() - pos.getY()) <= speed && Math.abs(position.getX() - pos.getX()) <= speed;
    }

    protected Warrior(Position position, int speed, int range, int attack, int defence) {
        this.position = position;
        this.speed = speed;
        this.range = range;
        this.attack = attack;
        this.defence = defence;
    }
}
