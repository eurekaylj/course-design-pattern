package exp1.t2;

public class SquarePaintFactory implements PaintFactory {
    @Override
    public ShapePaint creatPaint() {
        return new SquarePaint();
    }
}
