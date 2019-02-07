import rpg.Character;

public class TestCharacter {
    public static void main(String[] args){
        String name="Raymund";
        int strength = 0;
        int dexterity = 0;
        int intelligence = 0;
        
        Character p1= new Character( name, strength, dexterity, intelligence);
        String name2="Grace";
        int strength2 =0;
        int dexterity2 = 0;
        int intelligence2 = 0 ;
        
        Character p2= new Character(name2, strength2, dexterity2, intelligence2);
        for (int at=1; at<100;at++){
            System.out.println("Round "+at);
            System.out.println(name+": "+ p1.getCurrentLife());
            System.out.println(name2+": "+ p2.getCurrentLife());
            int p1attack=p1.attack();
            int p2attack=p2.attack();
            System.out.println(name+" attacks "+name2+" for "+p1attack);
            System.out.println(name2+" attacks "+name+" for "+p2attack);
            p1.wound(p2attack);
            p2.wound(p1attack);
            if(p1.getCurrentLife()<0 && p2.getCurrentLife()<0) {
            	p1.setCurrentLife(0);
            	p2.setCurrentLife(0);
            	System.out.println(name+": "+p1.getCurrentLife());
                System.out.println(name2+": "+p2.getCurrentLife());
                System.out.println("DRAW!");
                break;
            }
            else if (p1.getCurrentLife()<0){
            	p1.setCurrentLife(0);
            System.out.println(name+": "+p1.getCurrentLife());
            System.out.println(name2+": "+p2.getCurrentLife());
            System.out.print(name2+" WINS THE DUEL!");
            break;
            }
            
            else if (p2.getCurrentLife()<0){
            	p2.setCurrentLife(0);
            System.out.println(name+": "+p1.getCurrentLife());
            System.out.println(name2+": "+p2.getCurrentLife());
            System.out.print(name+" WINS THE DUEL!");
            break;
            }
        }

    }
}