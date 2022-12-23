package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.draw.ConsoleDraw;
import ru.vsu.cs.eliseev.game.draw.ConsoleDrawer;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.game.Game2;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsoleGame {
    private final Game2 game2 = new Game2();
    private ConsoleDrawer cd = new ConsoleDrawer();
    Map<Class<? extends Cell>, String> cellDrawer = cd.getIconsForCell();
    Map<Class<? extends Warrior>, String> warriorDrawer = cd.getIconsForWarrior();

    public ConsoleGame() {
        Game(game2.getBf());
    }

    private void Game(Battlefield bf){
        Scanner sc = new Scanner(System.in);
        String command = "start";
        print(bf.getField());
        while (!command.equals("stop")){

                System.out.println("Entry command: move, attack");
                command = sc.nextLine();
                while(!command.equals("end")){
                    switch (command) {
                        case ("move") -> {
                            System.out.println("Entry position of troop");
                            Position from = Position.fromSting(sc.nextLine());
                            System.out.println("Entry position of destination");
                            Position to = Position.fromSting(sc.nextLine());
                            if(!game2.move(new Position[]{from, to})){
                                System.out.println("Incorrect positions");
                            }
                            print(bf.getField());
                        }
                        case ("attack") -> print(bf.getField());
                    }
                    System.out.println("Entry command: move, attack");
                    command = sc.nextLine();
                }
            System.out.println("if you want out print stop");
            command = sc.nextLine();
        }
        System.out.println("Game Over");
    }

    private void print(Cell[][] field){
        for (int i = 0; i < 20; i++) {
            if (i == 0){
                System.out.print("   ");
                for (int j = 0; j < 25; j++) {
                    System.out.format("%3s",  j);
                }
                System.out.println();
            }
            System.out.format("%3s",  i);
            for (int j = 0; j < 25; j++) {
                if (field[i][j].getWarrior() != null){
                    String str = cellDrawer.get(field[i][j].getClass()) + warriorDrawer.get(field[i][j].getWarrior().getClass());
                    System.out.format("%3s",  str);
                } else {
                    System.out.format("%3s", cellDrawer.get(field[i][j].getClass()));
                }
            }
            System.out.println();
        }
    }
}
