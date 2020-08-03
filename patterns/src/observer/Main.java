package observer;

public class Main {
    /// https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver o1 = new StockObserver(stockGrabber);
        StockObserver o2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(101);
        stockGrabber.setAaplPrice(202);
        stockGrabber.setIbmPrice(123);
        stockGrabber.setGooglPrice(303);
        stockGrabber.setAaplPrice(22);


        Runnable threadedIBM = new StockThreaded(2, "IBM", 101, stockGrabber);
        Runnable threadedAAPL= new StockThreaded(2, "AAPL", 223, stockGrabber);
        Runnable threadedGOOGL = new StockThreaded(2, "GOOGL", 123, stockGrabber);

        new Thread(threadedIBM).start();
        new Thread(threadedAAPL).start();
        new Thread(threadedGOOGL).start();


    }
}
