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
public class A2Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number.");
                double a = input.nextInt();
                System.out.println("Please enter another number.");
                double b = input.nextInt();
                System.out.println("Please enter another number.");
                double c = input.nextInt();
                boolean Works=false;
                
                if(Math.pow(a,2.0)+Math.pow(b,2.0)==Math.pow(c,2.0)){
                    System.out.println(+a+"^2+"+b+"^2="+c+"^2.");
                    Works=true;
                }
                if(Math.pow(a,2.0)+Math.pow(c,2.0)==Math.pow(b,2.0)){
                    System.out.println(+a+"^2+"+c+"^2="+b+"^2.");
                    Works=true;
                }
                
                if(Math.pow(b,2.0)+Math.pow(c,2.0)==Math.pow(a,2.0)){
                    System.out.println(+b+"^2+"+c+"^2="+a+"^2.");
                    Works=true;
                }
                if(Works==false){
                    System.out.println("Doesn't work.");
                }

                
    }
}
