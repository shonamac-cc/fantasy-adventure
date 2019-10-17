package fantasyWorld.weapons;

import fantasyWorld.behaviours.IWeapon;

public abstract class Weapon implements IWeapon {

    private int damagePoints;
    private String name;

    public Weapon(int damagePoints, String name) {
        this.damagePoints = damagePoints;
        this.name = name;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public String  getName() {
        return this.name;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
