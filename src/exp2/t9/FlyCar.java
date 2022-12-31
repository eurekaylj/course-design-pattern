package exp2.t9;

public class FlyCar extends CarDecorator{
    public FlyCar(Vehicle vehicle) {
        super(vehicle);
    }

    public void fly() {
        System.out.println("Car is flying.");
    }
}
