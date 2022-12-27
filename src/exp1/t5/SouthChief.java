package exp1.t5;

public class SouthChief implements Chief {
    @Override
    public Noodle createNoodle() {
        return new SouthNoodle();
    }

    @Override
    public Rice createRice() {
        return new SouthRice();
    }
}
