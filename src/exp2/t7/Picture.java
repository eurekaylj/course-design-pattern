package exp2.t7;

public class Picture implements Software {
    Application application = new Application();

    @Override
    public void run() {
        System.out.println("The picture is running.");
        application.run();
    }
}
