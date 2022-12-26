package exp1.t2;

public class CirclePaintFactory implements PaintFactory {
    @Override
    public ShapePaint creatPaint() {
        return new CirclePaint();
    }
}
