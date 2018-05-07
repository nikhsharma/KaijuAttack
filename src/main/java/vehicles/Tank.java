package vehicles;

import interfaces.Attackable;
import interfaces.Damageable;

public class Tank extends Vehicle implements Attackable {

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(Damageable enemy) {
        enemy.takeDamage(getAttackValue());
    }

    public void lightAttack(Damageable enemy) {
        enemy.takeDamage(getAttackValue()/2);
    }
}
