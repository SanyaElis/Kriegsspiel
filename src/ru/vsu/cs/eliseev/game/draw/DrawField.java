package ru.vsu.cs.eliseev.game.draw;

import ru.vsu.cs.eliseev.game.battlefield.*;

public class DrawField {//todo интрефейс DrawField с разной реализацией

    public static String drawOnConsole(Arsenal arsenal) {
        if (arsenal.getWarrior() == null)
            return "  ⚑";//⚑
        else return "⚑" + arsenal.getWarrior().print();
    }

    public static String drawOnConsole(Fortress fortress) {
        if (fortress.getWarrior() == null)
            return "  \uD83C\uDFF0";//🏰
        else return "\uD83C\uDFF0" + fortress.getWarrior().print();
    }

    public static String drawOnConsole(Ground ground) {
        if (ground.getWarrior() == null)
            return "_";
        else return ground.getWarrior().print();
    }

    public static String drawOnConsole(Mountain mountain) {
        return "  ⛰";//⛰
    }

    public static String drawOnConsole(MountainPass mp) {
        if (mp.getWarrior() == null)
            return  "  ⇔";//⇔
        else return "⇔" + mp.getWarrior();
    }
}
