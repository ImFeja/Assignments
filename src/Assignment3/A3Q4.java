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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
                System.out.println("Please give us a number greater than 1.");
                int Numba = input.nextInt();
                int counter=0;
                int down = 1;
                while(Numba<=0){                   
                    System.out.println("Greater than 1 please.");
                    Numba = input.nextInt();
                    counter=counter+1;
                    if(counter==5){
                    System.out.println("JUST PUT A NUMBER BIGGER THAN ONE ALREADY!!!");
                }
             }  
                for(int i = 0; i < Numba; i++){
                    
                }
    }
}
