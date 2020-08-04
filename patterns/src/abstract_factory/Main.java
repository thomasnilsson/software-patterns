package abstract_factory;

import factory.EnemyShip;
import factory.EnemyShipFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Abstract Factory");


        Scanner input = new Scanner(System.in);

        System.out.println("What type of ship? (U/R/B)");

        String option = "None";

        while(input.hasNextLine()) {
            option = input.nextLine();
            factory.EnemyShip enemyShip = EnemyShipFactory.makeEnemyShip(option);
            doStuff(enemyShip);
            System.out.println("What type of ship? (U/R/B)");
        }
    }

    public static void doStuff(EnemyShip ship) {
        ship.display();
        ship.followHeroShip();
        ship.shoot();
    }
}
