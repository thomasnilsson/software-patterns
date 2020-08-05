package prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep made!");
    }

    @Override
    public Animal makeCopy() {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "I am a sheep. Baaa";
    }
}
