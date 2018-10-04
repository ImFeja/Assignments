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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int Numba = input.nextInt();
        if(Numba%11==0.0){
            System.out.println(+ Numba + " is a special number!");   
        }
        if(Numba%11==1.0){
            System.out.println(+ Numba + " is a special number!");   
        }
        
        
    }
}

