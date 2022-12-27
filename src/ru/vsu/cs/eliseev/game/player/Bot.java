package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.List;
import java.util.Random;

public class Bot implements AskPosition{
    private Player bot;
    private Random random = new Random();

    public Bot(Player bot) {
        this.bot = bot;
    }

    @Override
    public Position[] askPosition() {
        List<Warrior> troops = bot.getTroops();
        Warrior warrior = troops.get(random.nextInt(troops.size() - 1));
        Position from = warrior.getPosition();
        Position to = new Position(from.getX() + random.nextInt(-1,2), from.getY() + random.nextInt(-1,2));
        System.out.println(from);
        System.out.println(to);
        return new Position[]{from, to};
    }
}
