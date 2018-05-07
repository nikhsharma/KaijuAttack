import kaijus.LandLizard;
import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    LandLizard landLizard;

    @Before
    public void before() {
        tank = new Tank("Boomy", 100, 20);
        landLizard = new LandLizard("Godzilla", 100, 20);
    }

    @Test
    public void hasType() {
        assertEquals("Boomy", tank.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, tank.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(20, tank.getAttackValue());
    }

    @Test
    public void canTakeDamage() {
        tank.takeDamage(20);
        assertEquals(80, tank.getHealthValue());
    }

    @Test
    public void canAttackEnemy() {
        tank.attack(landLizard);
        assertEquals(80, landLizard.getHealthValue());
    }
}
