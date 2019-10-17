package fantasyWorld.players.fighters;


import fantasyWorld.behaviours.IWeapon;
import fantasyWorld.players.Player;
import fantasyWorld.players.enemies.Enemy;
import fantasyWorld.weapons.Sword;
import fantasyWorld.weapons.Weapon;

import java.util.ArrayList;

public class Barbarian extends Fighter{

    ArrayList<IWeapon> weapons;

    public Barbarian(int healthPoints) {
        super(healthPoints);
        this.weapons = new ArrayList<IWeapon>();
    }

    public void addWeapon(IWeapon weapon){
        weapons.add((weapon));
    }
    
    public String attack(){
//       call the Sword.attack method
        return "I attack with a sword" + " and I've done x damage";
    }

    public ArrayList<IWeapon> getWeapons() {
        ArrayList<IWeapon> foundWeapon = new ArrayList<IWeapon>();
        for(IWeapon iWeapon : this.weapons){
                foundWeapon.add(iWeapon);
        }
        return foundWeapon;
    }

}
