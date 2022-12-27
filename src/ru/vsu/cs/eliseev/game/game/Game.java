package ru.vsu.cs.eliseev.game.game;


import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.player.AskPosition;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.player.Bot;
import ru.vsu.cs.eliseev.game.units.Position;

import java.util.List;

public class Game {
    private final API gameAPI;
    private final Battlefield bf = new Battlefield();

    public Game(API gameAPI) {
        this.gameAPI = gameAPI;
        Player mainPlayer = bf.getPlayers().get(0);
        mainPlayer.setAskPosition(new Bot(mainPlayer));
    }
    public Game(API gameAPI, AskPosition playerStrategy){
        this.gameAPI = gameAPI;
        bf.getPlayers().get(0).setAskPosition(playerStrategy);
    }
    public void startPlay(){
        gameAPI.drawBattlefield(bf.getField());
        List<Player> players = bf.getPlayers();
        players.get(1).setAskPosition(new Bot(players.get(1)));
        VariationOfStep command = VariationOfStep.START;
        while (command != VariationOfStep.STOP) {

            for (Player p : players) {
                int numOfMoves = 0;
                int numOfAttacks = 0;
                command = gameAPI.command();
                while ((numOfAttacks < 1 && numOfMoves < 1) && command != VariationOfStep.END) {
                    if (command == VariationOfStep.ATTACK) {
                        numOfAttacks++;
                    }
                    if (command == VariationOfStep.MOVE) {
                        Position[] fromTo = p.makeMove();
                        if (fromTo != null){
                            if (!p.move(fromTo[0], fromTo[1])) {
                                gameAPI.incorrectPosition();
                            } else {
                                numOfMoves++;
                                gameAPI.drawBattlefield(bf.getField());
                            }
                        }
                    }
                    command = gameAPI.command();
                }

            }

            if (gameAPI.stop()){
                command = VariationOfStep.STOP;
            }
        }
    }
}
