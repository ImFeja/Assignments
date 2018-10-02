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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number between 1 and 10.");
                int Numba = input.nextInt();
                while(1>Numba || Numba>10){
                    System.out.println("Between 1 and 10.");
                    Numba = input.nextInt();
                }
                System.out.println("You chose"+Numba);
    }
}
