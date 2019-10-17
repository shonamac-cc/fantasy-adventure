import fantasyWorld.players.fighters.Barbarian;
import fantasyWorld.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian conan;
    Sword sword;

    @Before
    public void before(){
        conan = new Barbarian(100);
        sword = new Sword(20);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, conan.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals("I attack with a sword and I've done x damage", conan.attack());
    }
}
