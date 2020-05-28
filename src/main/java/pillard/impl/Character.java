package pillard.impl;

public abstract class Character {
    private int health;
    private int attack;
    
    public Character(int health, int attack) { 
        this.health = health;
        this.attack = attack;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return "Character ";
    }
}
