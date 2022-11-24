package ru.vsu.cs.eliseev.game.draw;

import ru.vsu.cs.eliseev.game.battlefield.*;

public class ConsoleDraw implements DrawingCell{//todo интерфейс DrawField с разной реализацией

    public ConsoleDraw() {
    }


    @Override
    public void draw(Arsenal arsenal) {
        if (arsenal.getWarrior() == null)
            System.out.format("%3s", "  ⚑");//⚑
        else System.out.format("%3s", "⚑" + arsenal.getWarrior().print());
    }

    @Override
    public void draw(Fortress fortress) {
        if (fortress.getWarrior() == null)
            System.out.format("%3s", "  \uD83C\uDFF0");//🏰
        else System.out.format("%3s", "\uD83C\uDFF0" + fortress.getWarrior().print());
    }

    @Override
    public void draw(Ground ground) {
        if (ground.getWarrior() == null)
            System.out.format("%3s", "_");
        else System.out.format("%3s", ground.getWarrior().print());
    }

    @Override
    public void draw(Mountain mountain) {
        System.out.format("%3s", "  ⛰");//⛰
    }

    @Override
    public void draw(MountainPass mountainPass) {
        if (mountainPass.getWarrior() == null)
            System.out.format("%3s", "  ⇔");//⇔
        else System.out.format("%3s", "⇔" + mountainPass.getWarrior());
    }
}
