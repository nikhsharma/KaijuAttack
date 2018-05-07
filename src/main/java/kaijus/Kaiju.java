package kaijus;

import interfaces.Damageable;
import interfaces.Roarable;

public abstract class Kaiju implements Roarable, Damageable {
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

}
