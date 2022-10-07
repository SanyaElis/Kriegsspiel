package ru.vsu.cs.eliseev.player;

import ru.vsu.cs.eliseev.battlefield.Cell;
import ru.vsu.cs.eliseev.units.Position;
import ru.vsu.cs.eliseev.units.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Player {//todo отдать приказ на передвижение, хранить клетки которые видит игрок (туман войны) тумана не будет

    private final int numOfPlayer;
    private Position[] positionsOfArsenal;
    private List<Warrior> troops;//9 пехотинцами, 4 кавалеристами, 1 артиллерией и 1 быстрой артиллерией

    Warrior move(Position newPos, Warrior war){
        return null;
    }

    public Player(int numOfPlayer) {

        this.numOfPlayer = numOfPlayer;
        this.troops = Initialization.initialization(numOfPlayer);

    }

    public List<Warrior> getTroops() {
        return troops;
    }
}
