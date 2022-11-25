package ru.vsu.cs.eliseev.game.units;

public interface DrawingWarrior {
    void draw(Cannon cannon);
    void draw(SwiftRelay swiftRelay);
    void draw(Cavalry cavalry);
    void draw(Infantry infantry);
    void draw(Relay relay);
    void draw(SwiftCannon swiftCannon);
}
