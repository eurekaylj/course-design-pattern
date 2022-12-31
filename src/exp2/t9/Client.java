package exp2.t9;

public class Client {
    public static void main(String[] args) {
        Vehicle car1;

        car1 = new Car();
        car1.move();
        System.out.println("-----------");
        FlyCar car2 = new FlyCar(car1);
        car2.move();
        car2.fly();
    }
}
