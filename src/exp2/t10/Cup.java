package exp2.t10;

public abstract class Cup {
    private Milk milk;

    public Cup(Milk milk) {
        this.milk = milk;
    }

    public Milk getMilk() {
        return this.milk;
    }

    public abstract void pack();
}
