package exp3.t9;

public class Client {
    public static void main(String[] args) {
        Product product = new Product();
        Member member = new Member();

        product.attach(member);
        product.setName("Macbook Air M2");
        product.setPrice(12888.00);

    }
}
