import fantasyWorld.players.enemies.Orc;
import fantasyWorld.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Sword sword;

    @Before
    public void before(){
        orc = new Orc(100, "dave");
        sword = new Sword(25, "excalibur");
    }

    @Test
    public void getHealthPoints() {
        assertEquals(100, orc.getHealthPoints());
    }

    @Test
    public void getDamage(){
        orc.damage(sword);
        assertEquals(75, orc.getHealthPoints());
    }
}
