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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cups of tea is there?");
        int Tea = input.nextInt();
        System.out.println("How many candies are there?");
        int Candy = input.nextInt();
        if(Tea>=5&&Candy>=5){
            if(Tea*2>=Candy){
                System.out.println("That's a good party.");
            }else{
            if(Candy*2>=Tea){
                System.out.println("That's a good party.");
            }
            }
            if(Tea*2<=Candy){
                System.out.println("What a great party!");
            }else{
                if(Candy*2<=Tea){
                    System.out.println("What a great party!");
                }
            }
        }else{
            System.out.println("What a bad party...");
        }
}
}

