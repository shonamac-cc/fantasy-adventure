package fantasyWorld.players.enemies;
import fantasyWorld.weapons.Sword;
import fantasyWorld.weapons.Weapon;

public class Orc extends Enemy {

    public Orc(int healthPoints, String name) {
        super(healthPoints, name);
    }


    public int damage(Weapon weapon) {

         setHealthPoints(getHealthPoints() - weapon.getDamagePoints());

         return getHealthPoints();
    }


}
