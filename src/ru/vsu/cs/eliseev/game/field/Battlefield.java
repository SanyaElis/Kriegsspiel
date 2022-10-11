package ru.vsu.cs.eliseev.game.field;


import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.player.PlayerNumber;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.List;

public class Battlefield {

    private Cell[][] field;
    private List<Warrior> firstPlayerTroops;//todo убрать, создать список игроков
    private List<Warrior> secondPlayerTroops;

    public Battlefield() {

        Player p1 = new Player(PlayerNumber.P1);
        Player p2 = new Player(PlayerNumber.P2);

        field = new Cell[20][25];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 25; j++) {
                field[i][j] = new Ground();
            }
        }

        field[1][7] = new Fortress();
        field[8][12] = new Fortress();
        field[12][2] = new Fortress();
        field[7][20] = new Fortress();

        field[19][2] = new Arsenal();
        field[3][7] = new Arsenal();
        field[1][14] = new Arsenal();
        field[19][22] = new Arsenal();

        field[10][10] = new Mountain();
        setFirstPlayerTroops(p1.getTroops());
        setSecondPlayerTroops(p2.getTroops());
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
        for (Warrior troop : firstPlayerTroops) {
            Position pos = troop.getPosition();
            field[pos.getY()][pos.getX()].setWarrior(troop);
        }
    }

    public List<Warrior> getSecondPlayerTroops() {
        return secondPlayerTroops;
    }

    public void setSecondPlayerTroops(List<Warrior> secondPlayerTroops) {
        this.secondPlayerTroops = secondPlayerTroops;
        for (Warrior troop : secondPlayerTroops) {
            Position pos = troop.getPosition();
            field[pos.getY()][pos.getX()].setWarrior(troop);
        }
    }
}
