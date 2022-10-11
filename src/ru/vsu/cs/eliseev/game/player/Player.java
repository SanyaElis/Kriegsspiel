package ru.vsu.cs.eliseev.game.player;

import ru.vsu.cs.eliseev.game.units.Position;
import ru.vsu.cs.eliseev.game.units.Warrior;

import java.util.List;

public class Player {//todo отдать приказ на передвижение, хранить клетки которые видит игрок (туман войны) тумана не будет

    private final PlayerNumber playerNumber;//todo убрать
    private Position[] positionsOfArsenal;
    private List<Warrior> troops;//9 пехотинцами, 4 кавалеристами, 1 артиллерией и 1 быстрой артиллерией

    Warrior move(Position newPos, Warrior war){
        return null;
    }

    public Player(PlayerNumber playerNumber) {

        this.playerNumber = playerNumber;
        this.troops = Initialization.initialization(playerNumber);

    }

    public List<Warrior> getTroops() {
        return troops;
    }
}
