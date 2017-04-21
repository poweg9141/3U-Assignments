/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //new array with 2 elements
        int[] numbers = new int[2];
        //asks for the first number and stores it in a variable
        System.out.println("Enter number 1: ");
        numbers[0] = in.nextInt();
        //asks for the second number and stores it in a variable
        System.out.println("Enter number 2: ");
        numbers[1] = in.nextInt();

        //if the number at element 1 is bigger than at element 2
        if (numbers[0] > numbers[1]) {
            //stores the number from element 1 in a temporary variable
            int num2 = numbers[1];
            //makes element 1 equal to element 0
            numbers[1] = numbers[0];
            //makes element 0 equal to what used to be element 1
            numbers[0] = num2;
        }
        //prints out the ordered integers
        System.out.printf("The integers in ascending order are %s %s\n", numbers[0], numbers[1]);
    }
}
