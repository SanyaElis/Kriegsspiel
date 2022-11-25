package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.*;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.units.*;

import java.awt.*;

public class GraphicDrawer implements DrawingCell, DrawingWarrior {
    private Graphics2D g2d;
    private int height;
    private int width;


    public GraphicDrawer(Graphics2D g2d, int height, int width) {
        this.g2d = g2d;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Arsenal arsenal) {
        g2d.setColor(Color.RED);
        Position pos = arsenal.getPosition();
        g2d.fillRect(width * pos.getX() / 25, height * pos.getY() / 20, 10, 10);
        if (arsenal.getWarrior() != null){
            arsenal.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Fortress fortress) {
        g2d.setColor(Color.blue);
        Position pos = fortress.getPosition();
        g2d.fillRect(width * pos.getX() / 25, height * pos.getY() / 20, 10, 10);
        if (fortress.getWarrior() != null){
            fortress.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Ground ground) {
        g2d.setColor(Color.green);
        Position pos = ground.getPosition();
        g2d.fillRect(width * pos.getX() / 25, height * pos.getY() / 20, 10, 10);
        if (ground.getWarrior() != null){
            ground.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Mountain mountain) {
        g2d.setColor(Color.yellow);
        Position pos = mountain.getPosition();
        g2d.fillRect(width * pos.getX() / 25, height * pos.getY() / 20, 10, 10);
    }

    @Override
    public void draw(MountainPass mountainPass) {
        g2d.setColor(Color.gray);
        Position pos = mountainPass.getPosition();
        g2d.fillRect(width * pos.getX() / 25 + 10, height * pos.getY() / 20, 10, 10);
        if (mountainPass.getWarrior() != null){
            mountainPass.getWarrior().draw(this);
        }
    }

    @Override
    public void draw(Cannon cannon) {
        g2d.setColor(Color.RED);
        Position pos = cannon.getPosition();
        g2d.drawString("пуш" , width * pos.getX() / 25 + 10, height * pos.getY() / 20 + 10);
    }

    @Override
    public void draw(SwiftRelay swiftRelay) {
        g2d.setColor(Color.RED);
        Position pos = swiftRelay.getPosition();
        g2d.drawString("БП" , width * pos.getX() / 25 + 10, height * pos.getY() / 20 + 10);
    }

    @Override
    public void draw(Cavalry cavalry) {
        g2d.setColor(Color.RED);
        Position pos = cavalry.getPosition();
        g2d.drawString("кон" , width * pos.getX() / 25 + 10, height * pos.getY() / 20 + 10);
    }

    @Override
    public void draw(Infantry infantry) {
        g2d.setColor(Color.RED);
        Position pos = infantry.getPosition();
        g2d.drawString("пех" , width * pos.getX() / 25 + 10, height * pos.getY() / 20 + 10);
    }

    @Override
    public void draw(Relay relay) {
        g2d.setColor(Color.RED);
        Position pos = relay.getPosition();
        g2d.drawString("пер" , width * pos.getX() / 25 + 10, height * pos.getY() / 20 + 10);
    }

    @Override
    public void draw(SwiftCannon swiftCannon) {
        g2d.setColor(Color.RED);
        Position pos = swiftCannon.getPosition();
        g2d.drawString("бп" , width * pos.getX() / 25 + 10, height * pos.getY() / 20 + 10);
    }
}
