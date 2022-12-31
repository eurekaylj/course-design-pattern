package exp2.t8;

public class Client {
    public static void main(String[] args) {
        DrawAngle drawAngle = new DrawAngle();
        DrawCircle drawCircle = new DrawAdapter(drawAngle);

        drawCircle.insert("Draw a little cat.");
    }
}