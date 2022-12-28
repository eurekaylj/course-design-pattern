package exp1.t9.sec1;

public class Client {
    public static void main(String a[]) {
        Customer customer, copyCustomer;

        customer = new Customer();

        copyCustomer = (Customer) customer.clone();

        System.out.println("customer == copyCustomer?");
        System.out.println(customer == copyCustomer);

        System.out.println("customer.address == copyCustomer.address?");
        System.out.println(customer.getAddress() == copyCustomer.getAddress());
    }
}