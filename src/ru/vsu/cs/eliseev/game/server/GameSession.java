package ru.vsu.cs.eliseev.game.server;

import ru.vsu.cs.eliseev.game.game.Game;

import java.awt.*;
import java.net.Socket;

public class GameSession implements Runnable {
    private final Game game;
    private SocketMove socketMove;

    public GameSession(Socket socket) {//todo Бота
        socketMove = new SocketMove(socket);
        Player p1 = new Player("Player", Color.BLUE, new SocketStrategy(socket));
        Player p2 = new Player("Bot", Color.RED, new RandomStrategy("Bot"));
        game = new Game(p1, p2);
    }

    public void run() {//todo что-то типо консоли
        while (true) {
            game.makeStep();
            //game.getStatistics().forEach(System.out::println);
        }
        System.out.println("Game Over!");
    }
}
