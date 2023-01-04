package exp3.t10;

public class Client {
    public static void main(String[] args) {
        SoundPhone soundPhone = new SoundPhone();
        soundPhone.call();
        System.out.println("--------------------");

        VibrationPhone vibrationPhone = new VibrationPhone(soundPhone);
        vibrationPhone.call();
        vibrationPhone.vibration();

        System.out.println("--------------------");
        FlashPhone flashPhone = new FlashPhone(vibrationPhone);
        flashPhone.call();
        flashPhone.flash();

        System.out.println("--------------------");
        ComplexPhone complexPhone = new ComplexPhone(flashPhone);
        complexPhone.call();
        vibrationPhone.vibration();
        complexPhone.flash();
    }
}
