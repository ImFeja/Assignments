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
public class A2Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
                System.out.println("Please enter a the speed.");
                double Speed = input.nextInt();
                System.out.println("Please enter the speed limit.");
                int Limit = input.nextInt();
                if(Speed<=Limit){
                    System.out.println("You are under the speed limit.");
                }
                if(Speed>=Limit){
                    if(Speed-Limit>=1&&Speed-Limit<=20){
                        System.out.println("You have a $100 fine.");
                    }
                    if(Speed-Limit>=21&&Speed-Limit<=30){
                        System.out.println("You have a $270 fine.");
                    }
                    if(Speed-Limit<=31){
                        System.out.println("You have a $500 fine.");
                    }
                }
    }
}
