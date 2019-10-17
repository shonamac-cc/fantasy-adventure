package fantasyWorld.players;

public abstract class Player {

    private int healthPoints;

    public Player(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }


}
