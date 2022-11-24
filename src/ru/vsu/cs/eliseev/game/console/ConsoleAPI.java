package ru.vsu.cs.eliseev.game.console;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.draw.ConsoleDraw;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.game.API;
import ru.vsu.cs.eliseev.game.game.VariationOfStep;
import ru.vsu.cs.eliseev.game.units.Position;

public class ConsoleAPI implements API {
    private DrawingCell dc;

    public ConsoleAPI() {
        dc = new ConsoleDraw();
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public boolean endStep() {
        return false;
    }

    @Override
    public VariationOfStep command() {
        return null;
    }

    @Override
    public void drawBattlefield(Cell[][] field) {

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
                field[i][j].draw(dc);
            }
            System.out.println();
        }

    }

    @Override
    public Position askPosition() {
        return null;
    }
}
