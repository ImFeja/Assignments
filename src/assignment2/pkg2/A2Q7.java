/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg2;

import java.util.Scanner;

/**
 *
 * @author ottd6393
 */
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number to play FizzBuzz.");
                double Numba = input.nextInt();
                boolean Fizz=false;
                boolean buzz=false;
                if(Numba%3==0.0){
                    Fizz=true;
                }
                if(Numba%5==0.0){
                    buzz=true;
                }
                if(Fizz==true&&buzz==false){
                    System.out.println("You should say Fizz");
                }
                if(buzz==true&&Fizz==false){
                    System.out.println("You should say Buzz");
                }
                if(Fizz==true&&buzz==true){
                    System.out.println("You should say FizzBuzz");
                }
                if(Fizz==false&&buzz==false){
                    System.out.println("You should say "+Numba+".");
                }
                
    }
}
