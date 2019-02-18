import rpg.Character;
import rpg.Dice;

public class TestCharacter {

    static Dice dice = new Dice();

    public static void main(String[] args) {

        String name = "Saldua";
        int strength = dice.roll();
        int dexterity = 0;
        int intelligence = 0;

        Character p1 = new Character(name, strength, dexterity, intelligence);
        String name2 = "Dulay";
        int strength2 = dice.roll();
        int dexterity2 = 0;
        int intelligence2 = 0;

        Character p2 = new Character(name2, strength2, dexterity2, intelligence2);
        System.out.println("----DICE FIGHT----");
        
        boolean n = true;
        int i =1;
        while (i <=3) {
            System.out.println();
            System.out.println("Round " + i);
            System.out.println(name + ": " + p1.getCurrentLife());
            System.out.println(name2 + ": " + p2.getCurrentLife()); //Life Initialization

            if (p1.getCurrentLife() <= 0 && p2.getCurrentLife() <= 0) { // Draw
                p1.setCurrentLife(0);
                p2.setCurrentLife(0);
                System.out.println("Final Life: ");
                System.out.println(name + ": " + p1.getCurrentLife());
                System.out.println(name2 + ": " + p2.getCurrentLife());
                System.out.println("DRAW!");
                break;

            }
            System.out.println(name + " attacks " + name2 + " for " + p1.attack());
            p2.currentLife -= p1.damage;
            if (p2.currentLife <= 0) {
                p2.currentLife = 0;
                System.out.println("Dulay can't fight anymore");
                System.out.println();
                break;
            }

            System.out.println(name2 + " attacks " + name + " for " + p2.attack());
            p1.currentLife -= p2.damage;
            if (p1.currentLife <= 0) {
                p1.currentLife = 0;
                System.out.println("Saldua can't fight anymore");
                System.out.println();
                break;
            }
            i++;
        }
        
            if (p1.currentLife > p2.currentLife){
                System.out.println("Final Life");
                System.out.println();
                System.out.println(name + ": " + p1.getCurrentLife());
                System.out.println(name2 + ": " + p2.getCurrentLife());
                System.out.println("----!!!CONGRATULATION!!!----");
                System.out.print(name + " YOU WON THE DUEL!");
            } else if (p2.currentLife > p1.currentLife){
                System.out.println("");
                System.out.println("Final Life");
                System.out.println(name + ": " + p1.getCurrentLife());
                System.out.println(name2 + ": " + p2.getCurrentLife());
                System.out.println("----!!!CONGRATULATION!!!----");
                System.out.print(name2 + " YOU WON THE DUEL!");
            }
        

    }
}