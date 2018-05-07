package kaijus;

public class LandLizard extends Kaiju {

    public LandLizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "ROOOAAARRRR!!!";
    }

    public String move() {
        return "STOMP STOMP!!";
    }
}
