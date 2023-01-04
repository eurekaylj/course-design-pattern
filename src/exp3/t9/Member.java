package exp3.t9;

public class Member implements MyObserver {
    @Override
    public void response(MyObservable myObservable, Object object) {
        Product product = (Product) myObservable;
        if (object instanceof String) {
            System.out.println("Name changed: " + product.getName());
        }
        if (object instanceof Double) {
            System.out.println("Price changed: " + product.getPrice());
        }
    }

}
