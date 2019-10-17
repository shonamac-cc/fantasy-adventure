package fantasyWorld.weapons;

import fantasyWorld.behaviours.IWeapon;

public class Sword extends Weapon implements IWeapon {

    private int damagePoints;


    public Sword(int damagePoints) {
        super(damagePoints);

    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    @Override
    public String attack() {
        return "I attack with a sword ";
    }
}
