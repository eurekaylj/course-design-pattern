package exp3.t9;

public class Product extends MyObservable {
    private String name;
    private double price;

    public void notifyObservers(Object object) {
        for (Object objects : observers) {
            ((MyObserver) objects).response(this, object);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.notifyObservers(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.notifyObservers(price);
    }
}
