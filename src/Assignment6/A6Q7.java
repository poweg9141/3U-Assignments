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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        
        //tells the user what the program does and asks them what number to count to
        System.out.println("This program finds prime numbers within a certain limit...");
        System.out.println("How high would you like to find prime numbers up to?");
        
        //sets a variable to one more than whatever they put in cause arrays start at 0
        int num = in.nextInt() + 1;
        
        //creates an array from zero to the specified number
        int[] list = new int[num];

        //set every element to its corresponding number
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        //set the initial variable
        int var = 2;
        
        //while the varibale is less than 9 because the only single digit prime numbers are less than 9
        while (var < 9) {
            //multiplies var by a counter and changes that sopt in the array to -1
            for (int i = 2; i < list.length / 2; i++) {
                int pos = i * var;
                if (pos < list.length) {
                    list[pos] = -1;
                }
            }
            //ad one to var until it is the next un-deleted (set to -1) single digit number
            var++;
            while (list[var] == -1) {
                var++;
            }
        }
        //removes the two numbers not included in the list of prime numbers
        //(the list started at 0 to make assigning spots in the array easier)
        list[0] = -1;
        list[1] = -1;


        //prints out all the numbers left in the array because they are all prime numbers
        System.out.println("The prime numbers from 1 to " + (num - 1) + " are as follows:");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != -1) {
                System.out.print(list[i] + " ");
            }
        }
    }
}
