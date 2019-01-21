package javaapplication238;

/**
 *
 * @author Acerr
 */
import java.io.*;

public class Mean {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    while (true){
        try {
            System.out.println("How many numbers do you want to input?");
            int array = Integer.parseInt(br.readLine());
            
            
            double size []= new double[array];
            for(int i = 0; i < array; i++){
            while(true){
            try{
                
                        System.out.println("Enter first number: " +i+ "");
                        size[i]=Float.parseFloat(br.readLine());
                        break;
                }
                 catch(Exception e) {
                     System.out.println("Invalid size, Please enter a valid number");
            }
            }
            }
        System.out.println("The mean is: "+mean(size));
       // in case 
       // System.out.println("Do you want to try again?: Yes or No?");
        break;
        }
        catch(Exception e) {
            System.out.println("Invalid size, Please enter a valid size");
        }
        
        
    }
        
    }
    public static double mean(double[] x){
        double average =0;
        
        
        for (int i = 0; i<x.length;i++){
            average+= x[i];
        }
            return average/x.length;
    }
}