package kaijus;

import interfaces.Attackable;
import interfaces.Damageable;
import interfaces.Moveable;
import interfaces.Roarable;

public abstract class Kaiju implements Roarable, Damageable, Moveable, Attackable {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void takeDamage(int amount) {
        this.healthValue -= amount;
    }

    public void attack(Damageable enemy) {
        enemy.takeDamage(attackValue);
    }

    public void lightAttack(Damageable enemy) {
        enemy.takeDamage(attackValue/2);
    }

}
