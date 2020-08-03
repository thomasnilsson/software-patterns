package observer;

public interface Observer {
    void update(double ibm, double aapl, double googl);
    int getObserverID();

}
