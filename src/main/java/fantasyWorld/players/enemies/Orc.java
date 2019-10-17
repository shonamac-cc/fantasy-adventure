package fantasyWorld.players.enemies;

import fantasyWorld.players.Player;

public class Orc extends Enemy {

    public Orc(int healthPoints, String name) {
        super(healthPoints, name);
    }

    public void damage(Player iweapon) {
        this.getHealthPoints() - iweapon.attack
    }


}
