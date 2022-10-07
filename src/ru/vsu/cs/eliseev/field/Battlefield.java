package ru.vsu.cs.eliseev.field;


import ru.vsu.cs.eliseev.battlefield.Cell;
import ru.vsu.cs.eliseev.units.Position;
import ru.vsu.cs.eliseev.units.Warrior;
import java.util.List;

public class Battlefield {

    private Cell[][] field = new Cell[20][25];
    private List<Warrior> firstPlayerTroops;
    private List<Warrior> secondPlayerTroops;

    public Battlefield() {
    }

    public Cell[][] getField() {
        return field;
    }

    public void setField(Cell[][] field) {
        this.field = field;
    }

    public List<Warrior> getFirstPlayerTroops() {
        return firstPlayerTroops;
    }

    public void setFirstPlayerTroops(List<Warrior> firstPlayerTroops) {
        this.firstPlayerTroops = firstPlayerTroops;
        for (Warrior troop: firstPlayerTroops) {
            Position pos = troop.getPosition();
            field[pos.getY()][pos.getX()].setWarrior(troop);
        }
    }

    public List<Warrior> getSecondPlayerTroops() {
        return secondPlayerTroops;
    }

    public void setSecondPlayerTroops(List<Warrior> secondPlayerTroops) {
        this.secondPlayerTroops = secondPlayerTroops;
        for (Warrior troop: secondPlayerTroops) {
            Position pos = troop.getPosition();
            field[pos.getY()][pos.getX()].setWarrior(troop);
        }
    }
}
