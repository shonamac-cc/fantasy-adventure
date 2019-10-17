package fantasyWorld.behaviours;


import fantasyWorld.players.Player;
import fantasyWorld.weapons.Weapon;

public interface IWeapon {

    String attack();
    String addWeapon(String data);
    String getName();
    int damage(Weapon weapon);
}
