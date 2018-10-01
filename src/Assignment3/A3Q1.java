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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             int  Numba=1;
             int Value=0;
             while(Numba<=199){
             Value=Value+Numba;
             Numba=Numba+2;
             }
             System.out.println(+Value+".");
    }
}
