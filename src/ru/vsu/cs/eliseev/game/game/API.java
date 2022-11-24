package ru.vsu.cs.eliseev.game.game;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.units.Position;

public interface API {

    boolean stop();
    boolean endStep();
    VariationOfStep command();
    void drawBattlefield(Cell[][] field);
    Position askPosition();

}
