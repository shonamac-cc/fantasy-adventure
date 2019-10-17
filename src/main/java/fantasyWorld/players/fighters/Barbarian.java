package fantasyWorld.players.fighters;


import fantasyWorld.weapons.Sword;

public class Barbarian extends Fighter{
    public Barbarian(int healthPoints) {
        super(healthPoints);
    }
    
    public String attack(){
//       call the Sword.attack method
        return "I attack with a sword" + " and I've done x damage";
    }
}
