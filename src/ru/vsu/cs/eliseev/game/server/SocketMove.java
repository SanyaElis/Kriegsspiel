package ru.vsu.cs.eliseev.game.server;

import ru.vsu.cs.eliseev.game.player.AskPosition;
import ru.vsu.cs.eliseev.game.units.Position;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketMove implements AskPosition {
    private final Socket socket;
    private final PrintWriter out;
    private final BufferedReader in;

    public SocketMove(Socket socket) {
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot connect to client", ex);
        }
    }


    @Override
    public Position[] askPosition() {
        String answer = "";
        try {
            String command = Command.MOVE.getCommandString() + Command.SEPARATOR + "Move";
            System.out.println("To client: " + command);
            out.println(command);
            while ((answer = in.readLine()) == null) {
            }
            System.out.println("From client: " + answer);
            String[] answerParsed = answer.split(Command.SEPARATOR);
            if (Command.MOVE.getCommandString().equals(answerParsed[0])) {
                System.out.println("Player's bet: " + answerParsed[1]);
            } else {
                throw new IllegalArgumentException("Client response is not recognized: "+answer);
            }
            String[] fromTo = answerParsed[1].split(" ");
            return new Position[]{Position.fromSting(fromTo[0]), Position.fromSting(fromTo[1])};
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot communicate with a client", ex);
        }
    }
}
