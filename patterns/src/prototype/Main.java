package prototype;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello prototype!");

        CloneFactory factory = new CloneFactory();

        Sheep sheep = new Sheep();
        Sheep clonedSheep = (Sheep) factory.getClone(sheep);
        System.out.println(sheep + ": "+ sheep.hashCode());
        System.out.println(clonedSheep + ": "+ clonedSheep.hashCode());

        Dog dog  = new Dog();
        Dog clonedDog = (Dog) factory.getClone(dog);
        System.out.println(dog + ": "+ dog.hashCode());
        System.out.println(clonedDog + ": "+ clonedDog.hashCode());
    }
}
