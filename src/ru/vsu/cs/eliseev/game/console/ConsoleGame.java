package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.units.Position;

import java.util.Scanner;

public class ConsoleGame {
    public static void startGame(){

        Battlefield bf = new Battlefield();
        print(bf.getField());
        Scanner sc = new Scanner(System.in);
        System.out.println(bf.getPlayers().get(0).move(new Position(13,9), new Position(14, 10)));
        bf.setPlayerTroops(bf.getPlayers().get(0).getTroops());
        print(bf.getField());
    }
    private static void print(Cell[][] field){
        for (int i = 0; i < 20; i++) {
            if (i == 0){
                for (int j = 0; j < 25; j++) {
                    System.out.format("%3s", j);
                }
                System.out.println();
            }
            System.out.print(i);
            for (int j = 0; j < 25; j++) {
                System.out.format("%3s", field[i][j].print());
            }
            System.out.println();
        }
    }

}
