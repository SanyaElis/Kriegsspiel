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
    public static Position fromMouseClick(int ex, int ey, int width, int height){
        int resX = -1;
        int resY = -1;
        for (int i = 0; i < 25; i++) {
            if (ex >= i * width / 25 && ex < (i + 1) * width / 25){
                resX = i;
            }
        }
        for (int i = 0; i < 20; i++) {
            if (ey >= i * height / 20 && ey < (i + 1) * height / 20){
                resY = i;
            }
        }
        System.out.println("x = " + resX + "y = " + resY);
        return new Position(resX, resY);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
