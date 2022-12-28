package exp1.t9.sec2;

public class Client {
    public static void main(String a[]) {
        Customer customer, copyCustomer = null;

        customer = new Customer();

        try {
            copyCustomer = (Customer) customer.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("customer == copyCustomer?");
        System.out.println(customer == copyCustomer);

        System.out.println("customer.address == copyCustomer.address?");
        System.out.println(customer.getAddress() == copyCustomer.getAddress());
    }
}