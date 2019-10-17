package fantasyWorld.players.fighters;

import fantasyWorld.behaviours.IWeapon;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(int healthPoints) {
        super(healthPoints);
    }

    public String attack(weapon) {
        return "I attack with a " + weapon + " I've done x damage ";
    }
}
