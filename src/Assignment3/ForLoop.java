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
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a mark.");
            int mark = input.nextInt();
            sum=sum+mark;
      }
        int avg=sum/5;
        System.out.println("Average = "+avg);
   }
}

    

