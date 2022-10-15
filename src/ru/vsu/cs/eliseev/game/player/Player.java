package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Player {

    //todo отдать приказ на передвижение

    private Position[] positionsOfArsenal;
    private List<Warrior> troops;//9 пехотинцами, 4 кавалеристами, 1 артиллерией и 1 быстрой артиллерией
    private List<Warrior> relays = new ArrayList<>();

    public boolean move(Position lastPos, Position newPos){
        for (Warrior troop: troops) {
            if (troop.getPosition().equals(lastPos)){
                return troop.move(newPos);
            }
        }
        return false;
    }


    public Player(List<Warrior> troops, Position[] positionsOfArsenal) {

        this.positionsOfArsenal = positionsOfArsenal;
        this.troops = troops;

    }

    public List<Warrior> getTroops() {
        return troops;
    }

    public void setRelay(List<Warrior> relays) {
        this.relays = relays;
    }

    public Position[] getPositionsOfArsenal() {
        return positionsOfArsenal;
    }
    public Position[] getPositionsOfRelays(){
        Position[] positions = new Position[relays.size() + positionsOfArsenal.length];
        System.arraycopy(positionsOfArsenal, 0, positions, 0, positionsOfArsenal.length);
        int j = positionsOfArsenal.length - 1;
        for (Warrior warrior: relays) {
            positions[j] = warrior.getPosition();
        }
        return positions;
    }
    public boolean isWarriorPlayers(Warrior war){
        for (Warrior warrior: troops) {
            if (war.getPosition().equals(warrior.getPosition())){
                return true;
            }
        }
        return false;
    }
}
