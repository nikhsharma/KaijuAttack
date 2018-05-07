import org.junit.Before;
import org.junit.Test;
import vehicles.Jet;

import static org.junit.Assert.assertEquals;

public class JetTest {

    Jet jet;

    @Before
    public void before() {
        jet = new Jet("Harrier", 100, 20);
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
}
