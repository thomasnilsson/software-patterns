package observer;

public class Stock {

    private double price;
    private String tracker;

    public Stock(double price, String tracker) {
        this.price = price;
        this.tracker = tracker;
    }

    @Override
    public String toString() {
        return tracker + " at  $" + price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTracker() {
        return tracker;
    }
}
