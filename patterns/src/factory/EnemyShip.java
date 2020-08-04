package factory;

public abstract class EnemyShip {
    String name;
    double damage;

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void display() {
        System.out.println(getName() + " is on the screen");
    }

    public void shoot() {
        System.out.println(getName() + " inflicts " + getDamage() + " amount of dmg" );
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getName() {

        return name;
    }

    public double getDamage() {
        return damage;
    }
}
