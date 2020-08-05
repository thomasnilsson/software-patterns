package prototype;

public class Dog implements Animal {

    public Dog() {
        System.out.println("Dog made!");
    }
    @Override
    public Animal makeCopy() {
        Dog dog = null;

        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

    @Override
    public String toString() {
        return "I am a dog. Woof.";
    }
}
