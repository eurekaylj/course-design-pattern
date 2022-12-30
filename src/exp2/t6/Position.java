package exp2.t6;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getChessPosition() {
        return "(" + x + ", " + y + ")";
    }
}
