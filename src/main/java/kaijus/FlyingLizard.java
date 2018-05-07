package kaijus;

public class FlyingLizard extends Kaiju {

    public FlyingLizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "SCREEECH!!!";
    }

    public String move() {
        return "WHOOSH!";
    }
}