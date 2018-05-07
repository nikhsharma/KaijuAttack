package vehicles;

import interfaces.Damageable;

public class Jet extends Vehicle {

    public Jet(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(Damageable enemy) {
        enemy.takeDamage(getAttackValue());
    }
}
