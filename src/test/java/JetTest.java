import kaijus.FlyingLizard;
import org.junit.Before;
import org.junit.Test;
import vehicles.Jet;

import static org.junit.Assert.assertEquals;

public class JetTest {

    Jet jet;
    FlyingLizard flyingLizard;

    @Before
    public void before() {
        jet = new Jet("Harrier", 100, 20);
        flyingLizard = new FlyingLizard("Varan", 100, 20);
    }

    @Test
    public void hasType() {
        assertEquals("Harrier", jet.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, jet.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(20, jet.getAttackValue());
    }

    @Test
    public void canTakeDamage() {
        jet.takeDamage(20);
        assertEquals(80, jet.getHealthValue());
    }

    @Test
    public void canAttackEnemy() {
        jet.attack(flyingLizard);
        assertEquals(80, flyingLizard.getHealthValue());
    }

    @Test
    public void hasLightAttack() {
        jet.lightAttack(flyingLizard);
        assertEquals(90, flyingLizard.getHealthValue());
    }
}
