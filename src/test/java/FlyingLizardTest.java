import kaijus.FlyingLizard;
import org.junit.Before;
import org.junit.Test;
import vehicles.Jet;

import static org.junit.Assert.assertEquals;

public class FlyingLizardTest {

    FlyingLizard flyingLizard;
    Jet jet;

    @Before
    public void before() {
        flyingLizard = new FlyingLizard("Varan", 100, 20);
        jet = new Jet("Harrier", 100, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Varan", flyingLizard.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, flyingLizard.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(20, flyingLizard.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("SCREEECH!!!", flyingLizard.roar());
    }

    @Test
    public void canTakeDamage() {
        flyingLizard.takeDamage(20);
        assertEquals(80, flyingLizard.getHealthValue());
    }

    @Test
    public void canAttackEnemy() {
        flyingLizard.attack(jet);
        assertEquals(80, jet.getHealthValue());
    }

    @Test
    public void canFly() {
        assertEquals("WHOOSH!", flyingLizard.move());
    }

    @Test
    public void hasLightAttack() {
        flyingLizard.lightAttack(jet);
        assertEquals(90, jet.getHealthValue());
    }
}
