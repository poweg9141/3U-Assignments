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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks for number to find factors of and stores it
        System.out.println("Enter a number to find the factors of:");
        int number = (int) in.nextDouble();
        //runs the factors class with the paramiter number
        factors(number);

    }

    private static void factors(int number) {
        //finds every factor of the number by dividing it by the counter and checking if theres a remainder
        System.out.println("All the factors of " + number + " are listed below:");
        for (int i = 1; i <= number; i++) {
            double ans = number / i;
            if (number % i == 0) {
                //if theres a remainder, prints out the number
                System.out.print((int)ans + " ");
            }
        }
        //new line so the "Build Successful" is on a different line
        System.out.println("\n");
    }
}
