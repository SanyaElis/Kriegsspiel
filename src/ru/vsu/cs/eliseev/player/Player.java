package ru.vsu.cs.eliseev.player;

import ru.vsu.cs.eliseev.battlefield.Cell;
import ru.vsu.cs.eliseev.troops.Position;
import ru.vsu.cs.eliseev.troops.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Player {//todo отдать приказ на передвижение, хранить клетки которые видит игрок (туман войны)
    
    private List<Cell> visibleField= new ArrayList<>();

    Warrior move(Position newPos){
        return null;
    }
}
