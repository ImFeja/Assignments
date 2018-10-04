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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number.");
        double Numba1 = input.nextInt();
        System.out.println("Please input a second number.");
        double Numba2 = input.nextInt(); 
        if(Numba1>Numba2){
            System.out.println("In order from smallest to largest: " + Numba2 +", "+ Numba1 +".");
        }
        if(Numba2>Numba1){
            System.out.println("In order from smallest to largest: " + Numba1 +", "+ Numba2 +".");
        }
        if(Numba1==Numba2){
            System.out.println("They are of equal values.");
        }
    }
}
