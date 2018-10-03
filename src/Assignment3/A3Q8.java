/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Scanner;

/**
 *
 * @author ottd6393
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Guess a number between 1-100.");
                int number = (int)(Math.random()*100 + 1);
                boolean correct=false;
                while(correct==false){
                    int Numba = input.nextInt();
                    while(Numba>number){
                        System.out.println("Too High.");
                        Numba = input.nextInt();
                    }
                    while(Numba<number){
                        System.out.println("Too Low.");
                        Numba = input.nextInt();
                     }
                    
                    if(Numba==number){
                        correct=true;
                    }
                }
                if(correct==true){
                    System.out.println("You got it! The number was "+number+ "!");
                }
    }
}
