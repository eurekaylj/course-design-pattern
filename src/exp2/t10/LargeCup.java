package exp2.t10;

public class LargeCup extends Cup {
    public LargeCup(Milk milk) {
        super(milk);
    }

    @Override
    public void pack() {
        String cup = "large";
        this.getMilk().pack(cup);
    }


}
