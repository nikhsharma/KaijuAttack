import kaijus.LandLizard;
import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class LandLizardTest {

    LandLizard landLizard;
    Tank tank;

    @Before
    public void before() {
        landLizard = new LandLizard("Godzilla", 100, 20);
        tank = new Tank("Boom", 100, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Godzilla", landLizard.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, landLizard.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(20, landLizard.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("ROOOAAARRRR!!!", landLizard.roar());
    }

    @Test
    public void canTakeDamage() {
        landLizard.takeDamage(20);
        assertEquals(80, landLizard.getHealthValue());
    }

    @Test
    public void canAttackEnemy() {
        landLizard.attack(tank);
        assertEquals(80, tank.getHealthValue());
    }

    @Test
    public void canMove() {
        assertEquals("STOMP STOMP!!", landLizard.move());
    }

    @Test
    public void hasLightAttack() {
        landLizard.lightAttack(tank);
        assertEquals(90, tank.getHealthValue());
    }

}
