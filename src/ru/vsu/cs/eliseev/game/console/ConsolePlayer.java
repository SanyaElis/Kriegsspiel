package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.player.AskPosition;
import ru.vsu.cs.eliseev.game.units.Position;

import java.util.Scanner;

public class ConsolePlayer implements AskPosition {
    private Scanner sc = new Scanner(System.in);
    @Override
    public Position[] askPosition() {

        System.out.println("Entry position of troop");
        Position from = Position.fromSting(sc.nextLine());
        System.out.println("Entry position of destination");
        Position to = Position.fromSting(sc.nextLine());

        return new Position[]{from, to};
    }
}
