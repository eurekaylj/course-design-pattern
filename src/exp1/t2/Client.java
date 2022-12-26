package exp1.t2;

public class Client {
    public static void main(String[] args) {
        try {
            ShapePaint paint;
            PaintFactory factory;

            factory = (PaintFactory) XMLUtil.getBean();
            paint = factory.creatPaint();

            paint.draw();
            paint.erase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
