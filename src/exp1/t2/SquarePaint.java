package exp1.t2;

public class SquarePaint implements ShapePaint {
    @Override
    public void draw() {
        System.out.println("Draw a square.");
    }

    @Override
    public void erase() {
        System.out.println("Erase a square.");
    }
}