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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Please give us a number between one and five.");
                int Numba = input.nextInt();
                int counter=0;
                int down = 1;
                while(Numba<=0 || Numba>=6){                   
                    System.out.println("Between one and five.");
                    Numba = input.nextInt();
                    counter=counter+1;
                    if(counter==5){
                    System.out.println("JUST PUT A NUMBER BETWEEN ONE AND FIVE ALREADY!!!");
                }
             }  
                for(int i = 1; i <= Numba; i++){
                    System.out.print("*");
                }
    }
}
