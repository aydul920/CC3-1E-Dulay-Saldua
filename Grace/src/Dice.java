/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
* The Dice class models rolling a regular six-sided die
*/
import java.util.Random;
public class Dice {
/** instance variables */
private final Random r;
/**
* Instantiate the object r
*/
public Dice() {
   this.r=new Random();
   
}
/**
* Returns a random integer between 1 and 6
     * @return 
*/
public int roll() {
    int roll=r.nextInt(6)+1;
    return roll;

}
}