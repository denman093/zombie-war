package pillard.impl.zombieImpl;

import pillard.impl.Character;

public abstract class Zombie extends Character {

    public Zombie(int health, int attack) {
        super(health, attack);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Zombie ";
    }
}
