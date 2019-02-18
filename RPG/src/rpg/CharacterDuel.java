package rpg;

/**
 *
 * @author m304user
 */
public class CharacterDuel {
static Dice dice = new Dice();
    static Dice dice2 = new Dice();
      
    public static void main(String[] args) {
        
       
        Character  Character = new Character("Saldua", dice.roll(),dice.roll(),dice.roll());
        Wizard Wizard2 = new Wizard ("Dulay", dice2.roll(),dice2.roll(),dice2.roll());
        System.out.println("----WIZARD FIGHT----");
        System.out.println("");
    
        
        boolean n = true;
        int  i=1;
        while (n) {
            System.out.println();
            System.out.println("√Round- " + i);
            System.out.println("Saldua" + ": " + Character.getCurrentLife());
            System.out.println("Dulay"+ ": " + Wizard2.getCurrentLife()); //Life Initialization\
           
           
            if (Character.getCurrentLife() <= 0 && Wizard2.getCurrentLife() <= 0) { // Draw
                Character.setCurrentLife(0);
                Wizard2.setCurrentLife(0);
                System.out.println("FINAL LIFE: ");
                System.out.println("Saldua" + ": " + Character.getCurrentLife());
                System.out.println("Dulay" + ": " + Wizard2.getCurrentLife());
                System.out.println("DRAW!");
                break;

            }
               
            System.out.println("Saldua" + " Attacks " + "Dulay" + " for " + Character.attack());//p1 
            Wizard2.currentLife -= Character.damage;
            if (Wizard2.currentLife <= 0) {
               Wizard2.currentLife = 0;
                System.out.println("WIZARD Dulay can't fight anymore");
                System.out.println();
                break;
            }
            System.out.println("Dulay Current Magic" + ": " + Wizard2.getCurrentMagic());
            if (Wizard2.getCurrentMagic() <=0|| Wizard2.getCurrentMagic() <=4){
                System.out.println("Dulay Attack " + Wizard2.attack());
                Character.currentLife -= Wizard2.damage;
            }
            if (Wizard2.getCurrentMagic() >=5){
                System.out.println("Dulay" + " Cast a Ligtning Bolt to " + "Saldua"+ " for " + Wizard2.castLightningBolt());//p2 
                Character.currentLife -= Wizard2.castLightningBolt();
            }
            if (Character.currentLife <= 0) {
                Character.currentLife = 0;
                System.out.println("WIZARD Saldua can't fight anymore");
                System.out.println();
                
                break;
            }
            i++;
                    
        }
        
            if (Character.currentLife > Wizard2.currentLife){
                System.out.println(">FINAL LIFE<");
                System.out.println("Saldua" + ": " + Character.getCurrentLife());
                System.out.println("Dulay"+ ": " + Wizard2.getCurrentLife());
                System.out.println("");
                System.out.println("----!!!CONGRATULATION!!!----");
                System.out.println("");
                System.out.print("WIZARD Saldua" + " YOU WON THE DUEL!");
                System.out.println("");
                System.out.println("WIZARD Dulay: GG!, Nice Game");
            } else if (Wizard2.currentLife > Character.currentLife){
                System.out.println("");
                System.out.println("Final Life");
                System.out.println("Saldua"+ ": " +Character.getCurrentLife());
                System.out.println("Dulay"+ ": " + Wizard2.getCurrentLife());
                System.out.println("----!!!CONGRATULATION!!!----");
                System.out.println("");
                System.out.print("WIZARD Dulay" + " YOU WON THE DUEL!");
                System.out.println("");
                System.out.println("WIZARD Saldua: GG!, Nice Game");
                System.out.println("");
            }

    }
}
