package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Position[] positionsOfArsenal;
    private List<Warrior> troops;
    private List<Warrior> relays = new ArrayList<>();
    private Battlefield bf;
    private AskPosition askPosition;

    public Player(List<Warrior> troops, Position[] positionsOfArsenal) {

        this.positionsOfArsenal = positionsOfArsenal;
        this.troops = troops;

    }

    public void setAskPosition(AskPosition askPosition) {
        this.askPosition = askPosition;
    }

    public boolean move(Position lastPos, Position newPos) {
        if (newPos.getX() > 24 || newPos.getX() < 0 || newPos.getY() > 19 || newPos.getY() < 0 )
            return false;

        for (Warrior troop : troops) {
            if (troop.getPosition().equals(lastPos)) {
                if (troop.canReach(newPos) && bf.canMove(troop, newPos)) {
                    bf.getField()[lastPos.getY()][lastPos.getX()].setWarrior(null);
                    troop.move(newPos);
                    bf.updateTroops(this);
                    return true;
                }
            }
        }
        return false;
    }

    public Position[] makeMove() {
        return askPosition.askPosition();
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

    public Position[] getPositionsOfRelays() {
        Position[] positions = new Position[relays.size() + positionsOfArsenal.length];
        System.arraycopy(positionsOfArsenal, 0, positions, 0, positionsOfArsenal.length);
        int j = positionsOfArsenal.length - 1;
        for (Warrior warrior : relays) {
            positions[j] = warrior.getPosition();
        }
        return positions;
    }

    public boolean isWarriorPlayers(Warrior war) {
        for (Warrior warrior : troops) {
            if (war.getPosition().equals(warrior.getPosition())) {
                return true;
            }
        }
        return false;
    }

    public void setBattlefield(Battlefield bf) {
        this.bf = bf;
    }
}