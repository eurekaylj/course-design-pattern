package exp2.t1;

public class Adapter implements TargetCat, TargetDog {
    private TargetCat cat;
    private TargetDog dog;

    public Adapter(TargetCat cat, TargetDog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        // 实际上还是狗
        dog.bark();
    }

    @Override
    public void bark() {
        // 实际上还是猫
        cat.catchMouse();
    }
}
