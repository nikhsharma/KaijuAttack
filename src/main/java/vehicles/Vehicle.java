package vehicles;

import interfaces.Damageable;

public abstract class Vehicle implements Damageable {

    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
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
