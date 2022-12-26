package exp1.t2;

public class RectanglePaint implements ShapePaint {
    @Override
    public void draw() {
        System.out.println("Draw a rectangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erase a rectangle.");
    }
}