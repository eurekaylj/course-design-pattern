package exp3.t10;

public class ComplexPhone extends PhoneDecorator {
    public ComplexPhone(Phone phone) {
        super(phone);
    }

    public void flash() {
        System.out.println("Make a flash.");
    }

    public void vibration() {
        System.out.println("Make a vibration.");
    }
}
