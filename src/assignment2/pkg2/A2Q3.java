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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int Numba = input.nextInt();
        double equal=Numba%2;
        if(equal==0.0){
            System.out.println(+Numba+" is an equal number.");
        }
        if(equal==1){
            System.out.println(+Numba+" is not an equal number.");
        }
        if(equal==0.5){
            System.out.println(+Numba+" is not an equal number.");
        }
    }
}
