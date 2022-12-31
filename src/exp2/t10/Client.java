package exp2.t10;

public class Client {
    public static void main(String[] args) {
        Cup myCoffee = new LargeCup(new AddMilk());
        myCoffee.pack();
    }
}
