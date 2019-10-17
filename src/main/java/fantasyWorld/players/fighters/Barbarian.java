package fantasyWorld.players.fighters;

import fantasyWorld.behaviours.IWeapon;
import fantasyWorld.weapons.Weapon;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public String attack(Weapon weapon){
        return "I attack with a sword" + " and I've done x damage";
    }
}
