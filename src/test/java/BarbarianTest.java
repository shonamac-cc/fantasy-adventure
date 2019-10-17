import fantasyWorld.behaviours.IWeapon;
import fantasyWorld.players.fighters.Barbarian;
import fantasyWorld.weapons.Axe;
import fantasyWorld.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian conan;
    Sword sword;
    Axe axe;

    @Before
    public void before(){
        conan = new Barbarian(100);
        sword = new Sword(20, "excaliber");
        axe = new Axe(24, "CutterTron");
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, conan.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals("I attack with a sword and I've done x damage", conan.attack());
    }

    @Test
    public void hasWeapons(){
        conan.addWeapon(sword);
        conan.addWeapon(sword);
        conan.addWeapon(axe);
        conan.addWeapon(axe);
        ArrayList<IWeapon> expectedWeapons = new ArrayList<IWeapon>();
        expectedWeapons.add(sword);
        expectedWeapons.add(sword);
        expectedWeapons.add(axe);
        expectedWeapons.add(axe);
                assertEquals(expectedWeapons, conan.getWeapons());
    }

    @Test
    public void canChangeWeapon(){

    }
}
