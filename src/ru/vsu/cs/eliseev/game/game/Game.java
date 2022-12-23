package ru.vsu.cs.eliseev.game.game;

import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.units.Position;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

    private final Battlefield bf = new Battlefield();
    private final Queue<Player> playersOrder;
    private int numberOfMoves = 0;
    private int numberOfAttacks = 0;

    public Game() {
        playersOrder = new LinkedList<>(bf.getPlayers());
    }

    private void changePlayer(){
        numberOfMoves = 0;
        numberOfAttacks = 0;
        playersOrder.add(playersOrder.poll());
    }

    private Player stepOrder(){
        return playersOrder.peek();
    }

    public boolean move(Position[] fromTo){
        if (numberOfMoves > 5 || numberOfAttacks > 1){
            changePlayer();
            return false;
        }
        if (stepOrder().move(fromTo[0], fromTo[1])){
            numberOfMoves++;
            return true;
        }
        return false;
    }

    public void endOfStep(){
        changePlayer();
    }

    public Battlefield getBf() {
        return bf;
    }
}
