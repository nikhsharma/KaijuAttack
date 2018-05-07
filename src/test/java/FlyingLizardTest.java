import kaijus.FlyingLizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyingLizardTest {

    FlyingLizard flyingLizard;

    @Before
    public void before() {
        flyingLizard = new FlyingLizard("Varan", 100, 20);
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
}
