
package pillard.run;

import java.util.ArrayList;
import pillard.impl.zombieImpl.Tank;
import pillard.impl.zombieImpl.Zombie;
import pillard.impl.humanImpl.Human;
import pillard.impl.humanImpl.Soldier;
import pillard.impl.Character;
import pillard.impl.humanImpl.Teacher;
import pillard.impl.zombieImpl.CommonInfect;
import pillard.impl.humanImpl.Child;

public class MainGame {
    public static void main(String [] args) {
        
        Character tank = new Tank();
        Character soldier = new Soldier();
        Character child = new Child();
        Character commonInfect = new CommonInfect();
        
        System.out.println(soldier); 
        System.out.println(soldier.getHealth());
        System.out.println(soldier.getAttack());
        
        System.out.println(tank);
        System.out.println(tank.getHealth());
        System.out.println(tank.getAttack());
        
        System.out.println(child);
        System.out.println(child.getHealth());
        System.out.println(child.getAttack());
        
        System.out.println(commonInfect);
        System.out.println(commonInfect.getHealth());
        System.out.println(commonInfect.getAttack());
        
        int humanCount = 0;
        int zombieCount = 0;
        
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(tank);
        characters.add(child);
        characters.add(soldier);
        characters.add(commonInfect);
        
        for(Character character : characters) {
            if(character instanceof Human)
                humanCount++;
            if(character instanceof Zombie)
                zombieCount++;
        }
        
        System.out.println("Human count: " + humanCount);
        System.out.println("Zombie count: " + zombieCount);

    }
}
