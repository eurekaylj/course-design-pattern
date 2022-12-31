package exp2.t10;

public class AddMilk implements Milk {
    @Override
    public void pack(String cup) {
        String milk = "added";
        System.out.println("Cup: " + cup);
        System.out.println("Milk: " + milk);
    }
}
