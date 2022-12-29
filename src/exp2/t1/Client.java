package exp2.t1;

public class Client {
    public static void main(String[] args) {
        TargetDog dog = new ConcreteDog();
        TargetCat cat = new ConcreteCat();

        System.out.print("狗：");
        dog.bark();
        System.out.print("猫：");
        cat.catchMouse();

        Adapter adapter = new Adapter(cat, dog);

        System.out.print("狗模仿猫：");
        adapter.bark();
        System.out.print("猫模仿狗：");
        adapter.catchMouse();
    }
}
