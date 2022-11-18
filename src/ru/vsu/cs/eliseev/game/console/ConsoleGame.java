package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.player.Player;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.utils.WarriorParser;

import java.util.List;
import java.util.Scanner;

public class ConsoleGame {
    public static void startGame(){

        Battlefield bf = new Battlefield();
        print(bf.getField());
        Game(bf);

    }
    public static void Game(Battlefield bf){
        Scanner sc = new Scanner(System.in);
        List<Player> players = bf.getPlayers();
        String command = "start";
        while (!command.equals("stop")){

            for (Player p: players) {
                int numOfMoves  = 0;
                int numOfAttacks  = 0;
                System.out.println("Entry command: move, attack");
                command = sc.nextLine();
                while((numOfAttacks == 1 && numOfMoves == 5) || !command.equals("end")){
                    switch (command) {
                        case ("move") -> {
                            System.out.println("Entry position of troop");
                            Position from = Position.fromSting(sc.nextLine());
                            System.out.println("Entry position of destination");
                            Position to = Position.fromSting(sc.nextLine());
                            if(!p.move(from, to)){
                                System.out.println("Incorrect positions");
                            }
                            print(bf.getField());
                            numOfMoves++;
                        }
                        case ("attack") -> {
                            numOfAttacks++;
                            print(bf.getField());
                        }
                    }
                    System.out.println("Entry command: move, attack");
                    command = sc.nextLine();
                }
            }
            System.out.println("if you want out print stop");
            command = sc.nextLine();
        }
        System.out.println("Game Over");
    }

    private static void print(Cell[][] field){
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
                System.out.format("%3s", field[i][j].print());
            }
            System.out.println();
        }
    }

}
