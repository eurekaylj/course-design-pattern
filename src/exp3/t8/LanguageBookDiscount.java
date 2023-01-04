package exp3.t8;

public class LanguageBookDiscount implements Discount {
    private final double DISCOUNT = 2;

    @Override
    public double getDiscountedPrice(double price) {
        System.out.println("Language Book:");
        return price - DISCOUNT;
    }
}
