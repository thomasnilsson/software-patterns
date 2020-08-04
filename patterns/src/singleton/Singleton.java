package singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letters = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /// Synchronize the constructor
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();

                    Collections.shuffle(instance.letters);
                }
            }
        }
        return instance;
    }

    public LinkedList<String> getLetters() {
        return instance.letters;
    }

    public LinkedList<String> getTiles(int number) {
        LinkedList<String> tiles = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            String popped = instance.letters.remove(0);
            tiles.add(popped);
        }
        return tiles;
    }
}
