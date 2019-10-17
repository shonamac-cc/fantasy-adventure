package fantasyWorld.players.enemies;
import fantasyWorld.weapons.Sword;

public class Orc extends Enemy {

    public Orc(int healthPoints, String name) {
        super(healthPoints, name);
    }


    public void damage(Sword sword) {
        int damage = sword.getDamagePoints();
        int health = this.getHealthPoints();
        health -= damage;
    }


}
