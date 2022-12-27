package exp1.t5;

public class NorthChief implements Chief {
    @Override
    public Noodle createNoodle() {
        return new NorthNoodle();
    }

    @Override
    public Rice createRice() {
        return new NorthRice();
    }
}
