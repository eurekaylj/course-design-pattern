package exp3.t8;

public class ComputerBookDiscount implements Discount {
    private final double DISCOUNT = 0.9;

    @Override
    public double getDiscountedPrice(double price) {
        System.out.println("Computer Book:");
        return price * DISCOUNT;
    }
}
