import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before() {
        tank = new Tank("Boomy", 100, 20);
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
}
