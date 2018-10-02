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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
                System.out.println("Please enter a base.");
                double Base = input.nextInt();
                System.out.println("Please enter a exponent.");
                double Exp = input.nextInt();
                double Value=Base;
                double Times=1;
                while(Times<Exp){
                    Value=Value*Base;
                    Times=Times+1;                       
                }
                System.out.println(+Value+".");
    }
}
