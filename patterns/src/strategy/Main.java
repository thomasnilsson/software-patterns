package strategy;

public class Main {
    /// https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=3

    public static void main(String[] args) {
        Animal dog = new Dog();
        Bird bird = new Bird();

        System.out.println("Dog: " + dog.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());

        dog.flyingType = new CanFly();
        System.out.println("Dog: " + dog.tryToFly());
    }
}
