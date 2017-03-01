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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner
        Scanner input = new Scanner(System.in);
        //asks how many number to input
        System.out.println("How many numbers would you like to input?: ");
        int count = input.nextInt();
        System.out.println("Please enter those numbers on different lines: ");
        int[] nums = new int[count];
        for(int i = 0; i < count; i++)
            nums[i] = input.nextInt();
        System.out.println("Your new numbers are: ");
        for(int i = 0; i < count; i++){
            System.out.print(nums[i] + ", ");
        }
    }
}