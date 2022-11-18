package ru.vsu.cs.eliseev.game.units;

public record Position(int x, int y) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        return y == position.y;
    }

    public static Position fromSting(String str) {
        str = str.substring(1, str.length() - 1);
        String[] coordinates = str.split("(\\s|[,;])+");
        return new Position(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
