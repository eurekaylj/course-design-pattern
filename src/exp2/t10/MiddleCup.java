package exp2.t10;

public class MiddleCup extends Cup {
    public MiddleCup(Milk milk) {
        super(milk);
    }

    @Override
    public void pack() {
        String cup = "middle";
        this.getMilk().pack(cup);
    }


}
