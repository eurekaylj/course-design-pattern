package exp2.t9;

public abstract class CarDecorator implements Vehicle {
    private Vehicle vehicle;

    public CarDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void move() {
        vehicle.move();
    }
}
