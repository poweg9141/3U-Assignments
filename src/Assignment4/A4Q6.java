/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        
        //asks to enter speed limit and speed of car
        //stores them as ints
        System.out.println("Enter the speed limit: ");
        int limit = in.nextInt();
        System.out.println("Enter the recorded speed of the car: ");
        int speed = in.nextInt();
        
        //if not speeding
        if(speed <= limit)
            System.out.println("Congratulations, you are within the speed limit!");
        //if speeding 10 to 20 above
        else if(speed <= limit + 20)
            System.out.println("You are speeding and your fine is $100");
        //if speeding 20 to 30 above
        else if(speed <= limit + 30)
            System.out.println("You are speeding and your fine is $270");
        //if speeding 31 or above
        else if(speed >= limit + 31)
            System.out.println("You are speeding and your fine is $500");
    }
}
