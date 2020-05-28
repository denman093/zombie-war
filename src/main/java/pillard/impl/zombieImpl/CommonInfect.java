package pillard.impl.zombieImpl;

import pillard.impl.zombieImpl.Zombie;

public class CommonInfect extends Zombie {
    
    public CommonInfect() {
        super(30, 5);
    }

    @Override
    public String toString() {
        return super.toString() + "Common Infected";
    }
}
