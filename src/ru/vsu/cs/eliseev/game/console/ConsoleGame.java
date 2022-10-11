package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.field.Battlefield;

public class ConsoleGame {
    public static void startGame(){
        Battlefield bf = new Battlefield();
        print(bf.getField());
    }
    private static void print(Cell[][] field){

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.format("%3s", field[i][j].print());//todo переделать какой-то класс
            }
            System.out.println();
        }
    }
}
