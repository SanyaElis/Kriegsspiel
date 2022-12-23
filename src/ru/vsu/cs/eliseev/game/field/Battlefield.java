package ru.vsu.cs.eliseev.game.field;


import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.player.Initialization;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.List;

public class Battlefield {

    private final Cell[][] field;
    private final List<Player> players;

    public Battlefield() {

        players = Initialization.initialization();

        field = new Cell[20][25];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 25; j++) {
                field[i][j] = new Ground(new Position(j, i));
            }
        }
        for (Player p : players) {
            setArsenals(p.getPositionsOfArsenal());
            setPlayerTroops(p.getTroops());
            p.setBattlefield(this);
        }

        field[1][7] = new Fortress(new Position(7, 1));
        field[8][12] = new Fortress(new Position(12, 8));
        field[12][2] = new Fortress(new Position(2, 12));
        field[7][20] = new Fortress(new Position(20, 7));

        field[10][10] = new Mountain(new Position(10, 10));
        field[11][11] = new MountainPass(new Position(11, 11));
    }

    public Cell[][] getField() {
        return field;
    }

    public void setArsenals(Position[] positionsOfArsenals) {
        for (Position pos : positionsOfArsenals) {
            field[pos.getY()][pos.getX()] = new Arsenal(pos);
        }
    }

    public boolean checkCommunication(Warrior warrior) {
        for (Player p : players) {
            if (p.isWarriorPlayers(warrior)) {
                Position[] positionsOfRelays = p.getPositionsOfRelays();
                for (Position relayPos : positionsOfRelays) {
                    if (checkOneCommunication(relayPos, warrior.getPosition())) {
                        field[warrior.getPosition().getY()][warrior.getPosition().getX()].setWarrior(null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkBarrier(Position posFrom, Position posTo, Player p) {//8 случаев

        return false;
    }

    public boolean canMove(Warrior warrior, Position purpose) {
        return checkCommunication(warrior) && checkIsEmpty(purpose);
    }

    public boolean checkOneCommunication(Position positionOfRelay, Position warriorPos) {
        Position firstQuarter = new Position(positionOfRelay.getX() + Math.abs(positionOfRelay.getX() -
                warriorPos.getX()), positionOfRelay.getY() + Math.abs(positionOfRelay.getY() - warriorPos.getY()));
        return firstQuarter.getY() == positionOfRelay.getY() || firstQuarter.getX() == firstQuarter.getX() ||
                positionOfRelay.getY() - firstQuarter.getY() == positionOfRelay.getX() - firstQuarter.getX();
    }

    public boolean checkIsEmpty(Position pos) {
        return field[pos.getY()][pos.getX()].getWarrior() == null && field[pos.getY()][pos.getX()].isPatency();
    }

    public void setPlayerTroops(List<Warrior> PlayerTroops) {
        for (Warrior troop : PlayerTroops) {
            Position pos = troop.getPosition();
            field[pos.getY()][pos.getX()].setWarrior(troop);
        }
    }

    public void updateTroops(Player p) {
        setPlayerTroops(p.getTroops());
    }

    public List<Player> getPlayers() {
        return players;
    }
}