package observer;

public class StockObserver implements Observer {

    private static int observerIdTracker;
    private int observerID;

    private double ibm, aapl, googl;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = observerIdTracker++;
        System.out.println("New observer with ID " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googlPrice) {
        this.ibm = ibmPrice;
        this.aapl = aaplPrice;
        this.googl = googlPrice;

        System.out.println("UPDATE: Observer [" + observerID + "]");
        System.out.println("\t*IBM:\t$" + ibm);
        System.out.println("\t*AAPL:\t$" + aapl);
        System.out.println("\t*GOOGL:\t$" + googl);
    }

    @Override
    public int getObserverID() {
        return observerID;
    }

}
