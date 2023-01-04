package exp3.t10;

public class VibrationPhone extends PhoneDecorator {
    public VibrationPhone(Phone phone) {
        super(phone);
    }

    public void vibration() {
        System.out.println("Make a vibration.");
    }
}
