package fantasyWorld.weapons;

import fantasyWorld.behaviours.IWeapon;

public class Axe extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;


    public Axe(int damagePoints, String name) {
        super(damagePoints, name);
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int damage(Weapon weapon) {
        return 0;
    }

    public String attack() {
        return "I attack with a axe ";
    }

    public String addWeapon(String data) {
        return data;
    }
}
