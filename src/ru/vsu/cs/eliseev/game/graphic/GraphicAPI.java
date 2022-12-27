package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.game.API;
import ru.vsu.cs.eliseev.game.game.VariationOfStep;

public class GraphicAPI implements API {
    private MainFrame mainFrame;

    public GraphicAPI() {
        mainFrame = new MainFrame();
        mainFrame.setSize(910,775);
        mainFrame.setVisible(true);
    }

    @Override
    public boolean stop() {
        return mainFrame.stop();
    }

    @Override
    public VariationOfStep command() {
        return VariationOfStep.MOVE;
    }

    @Override
    public void drawBattlefield(Cell[][] field) {
        mainFrame.repaint();
    }


    @Override
    public void incorrectPosition() {
        System.out.println("Error");
    }
}
