/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks user for a number
        System.out.println("Please enter a number to find the first digit of:");
        //tells the user the result of the firstDigit method
        System.out.println("The first digit is " + firstDigit(in.nextInt()));
    }
    
    private static int firstDigit(int number){
        //returns the first digit of any number passed to it using substrings
        return Integer.parseInt(Integer.toString(number).substring(0, 1));
    }
}
