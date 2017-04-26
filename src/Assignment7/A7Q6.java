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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks for last digit
        System.out.println("Enter an integer to find the last digit:");
        //prints out result of lastDigit method
        System.out.println("The last digit is " + lastDigit(in.nextInt()));
    }

    private static int lastDigit(int number) {
        //finds the last digit in an array using remainders
        return Math.abs(number % 10);
    }
}
