package ru.vsu.cs.eliseev.game.game;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.units.Position;

public interface API {

    boolean stop();
    VariationOfStep command();
    void drawBattlefield(Cell[][] field);
    Position[] askPosition();
    void incorrectPosition();
}
