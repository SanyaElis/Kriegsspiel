package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.draw.ConsoleDraw;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.game.API;
import ru.vsu.cs.eliseev.game.game.VariationOfStep;
import ru.vsu.cs.eliseev.game.units.Position;

import java.util.Scanner;

public class ConsoleAPI implements API {

    private DrawingCell dc = new ConsoleDraw();
    private Scanner sc = new Scanner(System.in);

    public ConsoleAPI() {

    }

    @Override
    public boolean stop() {
        System.out.println("if you want out print stop");
        return sc.nextLine().equals("stop");
    }

    @Override
    public void incorrectPosition() {
        System.out.println("Incorrect positions");
    }

    @Override
    public VariationOfStep command() {
        String variation;
        while (true) {
            System.out.println("Entry command: move, attack, end");
            variation = sc.nextLine();
            switch (variation) {
                case ("move") -> {
                    return VariationOfStep.MOVE;
                }
                case ("attack") -> {
                    return VariationOfStep.ATTACK;
                }
                case ("end") -> {
                    return VariationOfStep.END;
                }
            }
        }
    }

    @Override
    public void drawBattlefield(Cell[][] field) {

        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                System.out.print("   ");
                for (int j = 0; j < 25; j++) {
                    System.out.format("%3s", j);
                }
                System.out.println();
            }
            System.out.format("%3s", i);
            for (int j = 0; j < 25; j++) {
                field[i][j].draw(dc);
            }
            System.out.println();
        }

    }

    @Override
    public Position[] askPosition() {

        System.out.println("Entry position of troop");
        Position from = Position.fromSting(sc.nextLine());
        System.out.println("Entry position of destination");
        Position to = Position.fromSting(sc.nextLine());

        return new Position[]{from, to};
    }
}
