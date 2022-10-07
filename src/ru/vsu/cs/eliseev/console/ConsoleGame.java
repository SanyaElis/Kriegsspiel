package ru.vsu.cs.eliseev.console;

import ru.vsu.cs.eliseev.battlefield.*;
import ru.vsu.cs.eliseev.field.Battlefield;
import ru.vsu.cs.eliseev.player.Player;

public class ConsoleGame {
    public static void startGame(){
        Player p1 = new Player(1);
        Player p2 = new Player(2);

        Battlefield bf = new Battlefield();
        Cell[][] field = new Cell[20][25];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 25; j++) {
                field[i][j] = new Ground();
            }
        }

        field[1][7] = new Fortress();
        field[8][12] = new Fortress();
        field[12][2] = new Fortress();
        field[7][20] = new Fortress();

        field[19][2] = new Arsenal();
        field[3][7] = new Arsenal();
        field[1][14] = new Arsenal();
        field[19][22] = new Arsenal();

        field[10][10] = new Mountain();
        bf.setField(field);
        bf.setFirstPlayerTroops(p1.getTroops());
        bf.setSecondPlayerTroops(p2.getTroops());

        print(bf.getField());
    }
    private static void print(Cell[][] field){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 25; j++) {
                field[i][j].print();
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
