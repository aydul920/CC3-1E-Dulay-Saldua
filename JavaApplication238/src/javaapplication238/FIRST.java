/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication238;

/**
 *
 * @author m304user
 */
public class FIRST {
    public static void main(String[] args){
        
        First();
        System.out.println("First Java App");
    }
        public static void First()
                
        {
            System.out.println("Hello");
            System.out.println("Hi");
            System.out.println("Ty");
        }
    

    public static double predictRaise(double moneyAmount){
        double newAmount;
        final double RAISE = 1.10;
        newAmount = moneyAmount = RAISE;
        System.out.println("With Raise, salary is " + newAmount);
        return newAmount;
    }
    
    
}