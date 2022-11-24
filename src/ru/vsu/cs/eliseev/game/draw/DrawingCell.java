package ru.vsu.cs.eliseev.game.draw;

import ru.vsu.cs.eliseev.game.battlefield.*;

public interface DrawingCell {

    void draw(Arsenal arsenal);
    void draw(Fortress fortress);
    void draw(Ground ground);
    void draw(Mountain mountain);
    void draw(MountainPass mountainPass);

}
