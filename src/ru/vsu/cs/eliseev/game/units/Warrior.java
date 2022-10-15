package ru.vsu.cs.eliseev.game.units;

import ru.vsu.cs.eliseev.game.field.Battlefield;

public abstract class Warrior implements Moving, Drawable {
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
        if (Math.abs(position.getY() - pos.getY()) <= speed && Math.abs(position.getX() - pos.getX()) <= speed){
            if (Battlefield.checkIsEmpty(pos) && Battlefield.checkCommunication(this)){
                position = pos;
                return true;
            }
        }
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
