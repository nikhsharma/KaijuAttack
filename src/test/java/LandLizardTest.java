import kaijus.LandLizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LandLizardTest {

    LandLizard landLizard;

    @Before
    public void before() {
        landLizard = new LandLizard("Godzilla", 100, 20);
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
}
