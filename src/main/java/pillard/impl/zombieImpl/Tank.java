package pillard.impl.zombieImpl;

import pillard.impl.zombieImpl.Zombie;

public class Tank extends Zombie {
    
    public Tank() {
        super(150, 20);
    }

    @Override
    public String toString() {
        return super.toString() + "Tank";
    }
}
