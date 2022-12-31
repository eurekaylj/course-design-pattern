package exp2.t10;

public class NoneMilk implements Milk {
    @Override
    public void pack(String cup) {
        String milk = "none";
        System.out.println("Cup: " + cup);
        System.out.println("Milk: " + milk);
    }
}
