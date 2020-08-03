package observer;

public class StockThreaded implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public StockThreaded(int startTime, String stock, double price, Subject stockGrabber) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }


    @Override
    public void run() {
        double delta = 0.06;

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double scale = 1 + (Math.random() * delta) - (delta / 2);
            price = price * scale;
            updatePrice();
        }
    }

    private void updatePrice() {
        StockGrabber grabber = (StockGrabber) stockGrabber;
        if (stock == "IBM") grabber.setIbmPrice(price);
        if (stock == "AAPL") grabber.setAaplPrice(price);
        if (stock == "GOOGL") grabber.setGooglPrice(price);

        System.out.println("Stock " + stock + " went up/down!");
    }
}
