package rpg;
/**
* The Character class models a character for a roleplaying game.
* A character has a name and 3 stats: strength, dexterity, and
intelligence, as
* well as maximum allowed life points and the current value.
*/
public class Character {
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int currentLife;
    private int maxLife;

/** static variables */
static Dice dice = new Dice();
/** instance variables */
/**
* Constructor takes 4 parameters: n,s,d,i and assigns them to
* instance variables name, strength, dexterity, intelligence.
* Also uses the dice instance to assign a random
* number to maxlife. currentlife is initialized to maxlife
     * @param n
     * @param s
     * @param d
     * @param i
*/
public Character(String n, int s, int d, int i) {
 this.name=n;
 this.strength=s;
 this.dexterity=d;
 this.intelligence=i;
 this.maxLife=dice.roll()+100;
 this.currentLife=maxLife;
 
}
/**
* Returns a random die roll using the roll method in the
* Dice.java, *modified by the character's strength
     * @return 
*/
public int attack() {
     int attack=dice.roll()+strength;
     return attack;
}
/**
* Decreases currentlife by the damage parameter
     * @param damage
*/
public void wound(int damage) {
    currentLife=currentLife-damage;
    
}
/**
* Increases currentlife by the heal parameter.
* currentlife cannot be greater than maxlife
     * @param heal
*/
public void heal(int heal) {
     if(currentLife>maxLife)
         currentLife=currentLife+heal;
}
/**
* Returns name
     * @return 
*/
public String getName() {
    return name;
}
/**
* Returns strength
     * @return 
*/
public int getStrength() {
    return strength;
}
/**
* Returns dexterity
     * @return 
*/
public int getDexterity() {
    return dexterity;
}
/**
* Returns intelligence
     * @return 
*/
public int getIntelligence() {
    return intelligence;
}
/**
* Returns currentlife
     * @return 
*/
public int getCurrentLife() {
    return currentLife;
}
/**
* Returns maxlife
     * @return 
*/
public int getMaxLife() {
    return maxLife;
}
public void setName(String name){
        this.name=name;
}
public void setStrength(int strength){
        this.strength=strength;
}
public void setDexterity(int dexterity){
        this.dexterity=dexterity;
}
public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
}
public void setMaxLife(int maxLife){
        this.maxLife=maxLife;
}
public void setCurrentLife(int currentLife){
    this.currentLife=currentLife;
}
public int decreaseCurrentLife(int attack){
    return attack;
}
} 