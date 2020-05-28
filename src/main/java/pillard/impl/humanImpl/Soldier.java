package pillard.impl.humanImpl;

import pillard.impl.humanImpl.Human;

public class Soldier extends Human {
    
    public Soldier() {
        super(100, 10);
    }
   
    @Override
    public String toString() {
        return super.toString() + "Soldier";
    }
}
