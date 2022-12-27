package exp1.t5;

public class USChief implements Chief {
    @Override
    public Noodle createNoodle() {
        return new USNoodle();
    }

    @Override
    public Rice createRice() {
        return new USRice();
    }
}
