package exp3.t8;

public class Book {
    private double price;
    private Discount discount;

    public double getPrice() {
        return discount.getDiscountedPrice(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
