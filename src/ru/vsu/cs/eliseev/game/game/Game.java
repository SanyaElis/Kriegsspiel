package ru.vsu.cs.eliseev.game.game;

import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.player.Player;

import java.util.List;

public class Game {//todo вынести логику с консоли
    //DrawingField
    //как взаимодействовать
    private API gameAPI;
    private Battlefield bf;
    public Game(API gameAPI) {
        this.gameAPI = gameAPI;
        Battlefield bf = new Battlefield();
    }
    public void startPlay(){
        gameAPI.drawBattlefield(bf.getField());
        List<Player> players = bf.getPlayers();

        for (Player p: players) {
            int numOfMoves  = 0;
            int numOfAttacks  = 0;
            VariationOfStep command = gameAPI.command();

        }
    }
}
