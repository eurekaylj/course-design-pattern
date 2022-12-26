package exp1.t2;

public class RectanglePaintFactory implements PaintFactory {
    @Override
    public ShapePaint creatPaint() {
        return new RectanglePaint();
    }
}
