package ru.vsu.cs.eliseev.game.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketMove {
    private final Socket socket;
    private final PrintWriter out;
    private final BufferedReader in;

    public SocketMove(Socket socket) {//todo отказаться
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot connect to client", ex);
        }
    }
    //todo возможно прописать всё в ручную
    public void endGame() {
        try {
//            String command = Command.END.getCommandString();
//            System.out.println("To client:"+command);
//            out.println(command);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Cannot close socket: "+e.getMessage());
            }
        }
    }
}
