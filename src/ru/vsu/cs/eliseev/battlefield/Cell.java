package ru.vsu.cs.eliseev.battlefield;

import ru.vsu.cs.eliseev.troops.Position;

public abstract class Cell {//todo кф влияющий на дальность обзора (горы меньше, равнины больше)
    protected int patency;//проходимость сделать в отрицательных int
    protected Position position;

}
