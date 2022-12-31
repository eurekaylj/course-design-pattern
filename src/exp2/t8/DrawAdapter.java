package exp2.t8;

public class DrawAdapter extends DrawCircle {
    DrawAngle drawAngle;

    public DrawAdapter(DrawAngle drawAngle) {
        this.drawAngle = drawAngle;
    }

    public void insert(String msg) {
        System.out.println("DrawCircle:");
        drawAngle.insert(msg);
    }
}
