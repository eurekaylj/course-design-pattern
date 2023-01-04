package exp3.t8;

import exp2.t4.Book;

public class NovelBookDiscount implements Discount {
    private final double DISCOUNT = 10;

    @Override
    public double getDiscountedPrice(double price) {
        System.out.println("Novel:");
        if (price >= 100) {
            return price - DISCOUNT;
        } else
            return price;
    }
}
