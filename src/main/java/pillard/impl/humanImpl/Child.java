package pillard.impl.humanImpl;

import pillard.impl.humanImpl.Human;

public class Child extends Human {
    
    public Child() {
        super(20, 2);
    }
   
    @Override
    public String toString() {
        return super.toString() + "Child";
    }
}
