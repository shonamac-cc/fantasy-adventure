import fantasyWorld.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(77, "Sting");
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(77, sword.getDamagePoints());
    }

    @Test
    public void hasName(){
        assertEquals("Sting", sword.getName());
    }

}
