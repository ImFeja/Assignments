/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author ottd6393
 */
public class A2Q1 {

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
            System.out.println(+ Numba1 +" is bigger than " + Numba2+ ".");
        }
        if(Numba2>Numba1){
            System.out.println(+ Numba2 +" is bigger than " + Numba1+ ".");
        }
        if(Numba1==Numba2){
            System.out.println(+ Numba1 +" is equal to " + Numba2+ " .");
        }
    }
}
