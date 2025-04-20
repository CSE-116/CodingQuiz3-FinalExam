package quiz;

public abstract class Mob {
    protected int health;
    protected int damage;

    public Mob(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public abstract int attack(Mob player);
}
