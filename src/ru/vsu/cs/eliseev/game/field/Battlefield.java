package ru.vsu.cs.eliseev.game.field;


import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.player.Initialization;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.List;

public class Battlefield {

    private static Cell[][] field;
    private static List<Player> players;

    public Battlefield() {

        players = Initialization.initialization();

        field = new Cell[20][25];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 25; j++) {
                field[i][j] = new Ground();
            }
        }
        for (Player p: players) {
            setArsenals(p.getPositionsOfArsenal());
            setPlayerTroops(p.getTroops());
        }

        field[1][7] = new Fortress();
        field[8][12] = new Fortress();
        field[12][2] = new Fortress();
        field[7][20] = new Fortress();

        field[10][10] = new Mountain();
    }

    public Cell[][] getField() {
        return field;
    }

    public void setField(Cell[][] field) {
        this.field = field;
    }

    public void setArsenals(Position[] positionsOfArsenals){
        for (Position pos: positionsOfArsenals) {
            field[pos.getY()][pos.getX()] = new Arsenal();
        }
    }
    public static boolean checkCommunication(Warrior warrior){//позиция арсенала + модуль разности
        for (Player p: players) {
          if (p.isWarriorPlayers(warrior)){
              Position[] positionsOfRelays = p.getPositionsOfRelays();
              for (Position relayPos: positionsOfRelays) {
                  if (checkOneCommunication(relayPos, warrior.getPosition())){
                      return true;
                  }
              }
          }
        }
        return false;
    }

    /**
     *
     * @param posFrom
     * @param posTo
     * @param p
     * @return true if path clear
     */
    public static boolean checkBarrier(Position posFrom, Position posTo, Player p){//8 случаев

        return false;
    }
    public static boolean checkOneCommunication(Position positionOfRelay, Position warriorPos){
        Position firstQuarter = new Position(positionOfRelay.getX() + Math.abs(positionOfRelay.getX() -
                warriorPos.getX()), positionOfRelay.getY() + Math.abs(positionOfRelay.getY() - warriorPos.getY()));
        return firstQuarter.getY() == positionOfRelay.getY() || firstQuarter.getX() == firstQuarter.getX() ||
                positionOfRelay.getY() - firstQuarter.getY() == positionOfRelay.getX() - firstQuarter.getX();
    }
    public static boolean checkIsEmpty(Position pos){
        return field[pos.getY()][pos.getX()].getWarrior() == null  && field[pos.getY()][pos.getX()].isPatency();
    }
    public void setPlayerTroops(List<Warrior> PlayerTroops) {
        for (Warrior troop : PlayerTroops) {
            Position pos = troop.getPosition();
            field[pos.getY()][pos.getX()].setWarrior(troop);
        }
    }

    public  List<Player> getPlayers() {
        return players;
    }
}
