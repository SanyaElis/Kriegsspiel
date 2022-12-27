package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.draw.ConsoleDrawer;
import ru.vsu.cs.eliseev.game.game.API;
import ru.vsu.cs.eliseev.game.game.VariationOfStep;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.Map;
import java.util.Scanner;

public class ConsoleAPI implements API {

    private final ConsoleDrawer cd = new ConsoleDrawer();
    Map<Class<? extends Cell>, String> cellDrawer = cd.getIconsForCell();
    Map<Class<? extends Warrior>, String> warriorDrawer = cd.getIconsForWarrior();
    private Scanner sc = new Scanner(System.in);

    public ConsoleAPI() {

    }

    @Override
    public boolean stop() {
        return false;
//        System.out.println("if you want out print stop");
//        return sc.nextLine().equals("stop");
    }

    @Override
    public void incorrectPosition() {
        System.out.println("Incorrect positions");
    }

    @Override
    public VariationOfStep command() {
        String variation;
        return VariationOfStep.MOVE;
//        while (true) {
//            System.out.println("Entry command: move, attack, end");
//            variation = sc.nextLine();
//            switch (variation) {
//                case ("move") -> {
//                    return VariationOfStep.MOVE;
//                }
//                case ("attack") -> {
//                    return VariationOfStep.ATTACK;
//                }
//                case ("end") -> {
//                    return VariationOfStep.END;
//                }
//            }
//        }
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
                if (field[i][j].getWarrior() != null){
                    System.out.format("%3s",  warriorDrawer.get(field[i][j].getWarrior().getClass()));
                } else {
                    System.out.format("%3s", cellDrawer.get(field[i][j].getClass()));
                }
            }
            System.out.println();
        }

    }

}
