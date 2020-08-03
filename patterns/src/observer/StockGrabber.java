package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private double ibmPrice = 0, aaplPrice = 0, googlPrice = 0;
    private ArrayList<Observer> observers = new ArrayList<>();

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGooglPrice(double googlPrice) {
        this.googlPrice = googlPrice;
        notifyObservers();
    }


    @Override
    public void register(Observer observer) {
        System.out.println("Observer [" + observer.getObserverID() + "] added");
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {

        observers.remove(observer);
        System.out.println("Observer [" + observer.getObserverID() + "] removed");
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(ibmPrice, aaplPrice, googlPrice);
        }

    }
}
