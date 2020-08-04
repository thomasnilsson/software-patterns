package singleton;

import java.util.LinkedList;

public class TileGrabber implements Runnable {

    @Override
    public void run() {

        Singleton instance = Singleton.getInstance();

        LinkedList<String> tiles = instance.getTiles(7);
        System.out.println("Instance ID: " + System.identityHashCode(instance));
        System.out.println(instance.getLetters());
        System.out.println(tiles);
        System.out.println("Got tiles!");

    }
}
