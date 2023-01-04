package exp3.t10;

public class FlashPhone extends PhoneDecorator {
    public FlashPhone(Phone phone) {
        super(phone);
    }

    public void flash() {
        System.out.println("Make a flash.");
    }
}
