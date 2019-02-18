/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */

   public class Wizard extends Character {
   private final int maxMagic;
   public int CurrentMagic;
   public int MagicAttack;
    
public Wizard(String n, int s, int d, int i){
    super(n,s,d,i);
    
    maxMagic = dice.roll(); 
    CurrentMagic = maxMagic;
}

public int castLightningBolt(){
     if(CurrentMagic >= 1){
CurrentMagic = maxMagic - 5;
return maxMagic + getIntelligence(); 
    }else{
         
return maxMagic;
    }
}


public int castHeal(){
int heal = dice.roll() + getIntelligence();
    if(CurrentMagic >= 10){
CurrentMagic = maxMagic - 8;
return heal;
    }else{
return 0;
    }
}

public int getmaxMagic(){
return maxMagic;
}

public int getCurrentMagic(){
return CurrentMagic;
}

public void magicAttack(){
        
   }
public void wound(int damage){
     currentLife = currentLife - MagicAttack;

     }

} 