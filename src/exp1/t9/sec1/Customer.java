package exp1.t9.sec1;

public class Customer implements Cloneable{
    private String name;
    private Address address = null;

    public Customer() {
        this.address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public Object clone() {
        Customer clone = null;
        try {
            clone = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure!");
        }
        return clone;
    }
}
