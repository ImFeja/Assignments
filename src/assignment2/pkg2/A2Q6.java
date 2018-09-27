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
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the week is tomorrow? (1=Monday...7=Sunday.)");
        int Day = input.nextInt();
        System.out.println("Is it a holiday? (0=No, 1=Yes)");
        int Holiday = input.nextInt();
        if(Day<=5){
            if(Holiday==1){
                System.out.println("You should set an alarm for 10:00 AM.");
            }else{
                System.out.println("You should set your alarm for 7:00 AM.");
            }
        }else{
            if(Day>=6&&Day<8){
                System.out.println("You should set an alarm for 10:00 AM");
            }
        }
        if(Day>=8){
            System.out.println("You should wake, up, you're dreaming.");
        }
    }
}
