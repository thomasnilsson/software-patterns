package factory;

import java.util.Scanner;

/// https://www.youtube.com/playlist?list=PLF206E906175C7E07

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner input = new Scanner(System.in);

        System.out.println("What type of ship? (U/R/B)");

        String option = "None";

        while(input.hasNextLine()) {
            option = input.nextLine();
            EnemyShip enemyShip = EnemyShipFactory.makeEnemyShip(option);
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
