package fantasyWorld.players.enemies;

public abstract class Enemy  {

    private int healthPoints;
    private String name;

    public Enemy(int healthPoints, String name) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void damage();
}
