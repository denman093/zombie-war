package pillard.impl.humanImpl;

import pillard.impl.humanImpl.Human;

public class Teacher extends Human {
    
    public Teacher() {
        super(50, 5);
    }
   
    @Override
    public String toString() {
        return super.toString() + "Teacher";
    }
}
