package exp2.t6;

public class ConcreteChess implements Chess {
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Position position) {
        System.out.println(this.getColor() + ": " + position.getChessPosition());
    }
}
