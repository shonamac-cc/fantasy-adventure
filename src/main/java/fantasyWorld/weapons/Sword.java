package fantasyWorld.weapons;

import fantasyWorld.behaviours.IWeapon;
import fantasyWorld.players.Player;

public class Sword extends Weapon implements IWeapon {


    public Sword(int damagePoints, String name) {
        super(damagePoints, name);
    }



//    public void setDamagePoints(int damagePoints) {
//        this.damagePoints = damagePoints;
//    }
//
//    public String getName() {
//        return name;
//    }

    public int damage(Weapon weapon) {
        return 0;
    }

    public String attack() {
        return "I attack with a sword ";
    }

    public String addWeapon(String data) {
        return data;
    }
}
