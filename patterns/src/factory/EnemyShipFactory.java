package factory;

public class EnemyShipFactory {

    public static EnemyShip makeEnemyShip(String type) {

        EnemyShip enemyShip;

        switch (type) {
            case "U":
                enemyShip = new UFOEnemyShip();
                break;
            case "R":
                enemyShip = new RocketEnemyShip();
                break;
            case "B":
                enemyShip = new BigUFOEnemyShip();
                break;
            default:
                enemyShip = null;
        }

        return enemyShip;
    }
}
