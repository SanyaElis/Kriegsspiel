package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.game.API;
import ru.vsu.cs.eliseev.game.game.VariationOfStep;
import ru.vsu.cs.eliseev.game.units.Position;


public class GraphicAPI implements API {

    private GraphicApp frame;

    public GraphicAPI() {
        frame = new GraphicApp(new Battlefield());
        frame.setVisible(true);
    }

    @Override
    public boolean stop() {
        return frame.isStop();
    }

    @Override
    public VariationOfStep command() {
        if (frame.isEnd()){
            return VariationOfStep.END;
        }
        return VariationOfStep.MOVE;
    }

    @Override
    public void drawBattlefield(Cell[][] field) {
        frame.repaintField();
    }

    @Override
    public Position[] askPosition() {
        return frame.getFromTo();
    }

    @Override
    public void incorrectPosition() {
        frame.incorrectPosition();
    }
}
