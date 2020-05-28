package pillard.impl.humanImpl;

import pillard.impl.Character;

public abstract class Human extends Character {

    public Human(int health, int attack) {
        super(health, attack);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Human ";
    }
}
