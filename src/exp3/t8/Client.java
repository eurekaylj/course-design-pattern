package exp3.t8;

public class Client {
    public static void main(String[] args) {
        Discount discount, discount1, discount2;
        Book book = new Book();
        double originalPrice = 120;//原价

        book.setPrice(originalPrice);
        System.out.println("原价为：" + originalPrice + "元");
        System.out.println("------------------------------");

        discount = new ComputerBookDiscount();
        book.setDiscount(discount);
        System.out.println("折扣后的价格：" + book.getPrice());
        System.out.println("------------------------------");

        discount1 = new LanguageBookDiscount();
        book.setDiscount(discount1);
        System.out.println("折扣后的价格：" + book.getPrice());
        System.out.println("------------------------------");

        discount2 = new NovelBookDiscount();
        book.setDiscount(discount2);
        System.out.println("折扣后的价格：" + book.getPrice());
    }
}
