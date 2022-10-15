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
    public boolean move(Position pos) {//1 проверить на возможность хода
        if (Math.abs(position.getY() - pos.getY()) <= speed && Math.abs(position.getX() - pos.getX()) <= speed){
            if (Battlefield.checkCommunication(this) && Battlefield.checkIsEmpty(pos)){
                position = pos;
                return true;
            }
        }
        System.out.println("Слишком далеко");
        return false;
    }//todo брать только I четверть

    protected Warrior(Position position, int speed, int range, int attack, int defence) {
        this.position = position;
        this.speed = speed;
        this.range = range;
        this.attack = attack;
        this.defence = defence;
    }
}
