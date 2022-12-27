package ru.vsu.cs.eliseev.game.server;

import ru.vsu.cs.eliseev.game.console.ConsoleAPI;
import ru.vsu.cs.eliseev.game.game.Game;
import ru.vsu.cs.eliseev.game.graphic.GraphicAPI;

import java.net.Socket;

public class GameSession implements Runnable {
    private final Game game;

    public GameSession(Socket socket) {//todo Бота
        SocketMove socketMove = new SocketMove(socket);
        game = new Game(new GraphicAPI(), socketMove);
    }

    public void run() {
        game.startPlay();
        System.out.println("Game Over!");
    }
}
