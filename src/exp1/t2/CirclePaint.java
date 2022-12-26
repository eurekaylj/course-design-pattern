package exp1.t2;

public class CirclePaint implements ShapePaint {
    @Override
    public void draw() {
        System.out.println("Draw a circle.");
    }

    @Override
    public void erase() {
        System.out.println("Erase a circle.");
    }
}
