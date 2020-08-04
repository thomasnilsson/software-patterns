package singleton;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        async();
    }

    public static void async() {
        System.out.println("Hello singleton async!");

        Runnable tileGrabberOne = new TileGrabber();
        Runnable tilGrabberTwo = new TileGrabber();

        new Thread(tileGrabberOne).start();
        new Thread(tilGrabberTwo).start();
    }

    public static void sync() {
        System.out.println("Hello singleton sync!");

        Singleton instance1 = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(instance1));
        System.out.println(instance1.getLetters());
        LinkedList<String> tiles1 = instance1.getTiles(7);
        System.out.println("Player one tiles:" + tiles1);

        Singleton instance2 = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(instance1));
        System.out.println(instance1.getLetters());
        LinkedList<String> tiles2 = instance2.getTiles(7);
        System.out.println("Player two tiles:" + tiles2);
    }
}
