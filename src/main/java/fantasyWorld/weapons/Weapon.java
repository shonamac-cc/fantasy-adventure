package fantasyWorld.weapons;

public abstract class Weapon {

    private int damagePoints;

    public Weapon(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
