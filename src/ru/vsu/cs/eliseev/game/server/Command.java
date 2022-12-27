package ru.vsu.cs.eliseev.game.server;

public enum Command {
    GAME("GAME"),
    BET("BET"),
    RESP("RESP"),
    END("END");

    public static final String SEPARATOR = ":";

    private final String commandString;

    Command(String commandString) {
        this.commandString = commandString;
    }

    public String getCommandString() {
        return commandString;
    }
}
