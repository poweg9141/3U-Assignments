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
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks user to input number
        System.out.println("Enter a number please:");
        //converts number to string and stores it as temp variable
        String temp = Integer.toString(in.nextInt());
        //creates new integeer array
        int[] number = new int[temp.length()];
        
        //puts each character in the temp string into the int array
        for (int i = 0; i < temp.length(); i++) {
            number[i] = temp.charAt(i) - '0';
        }

        //if all digits are off tells the user
        if(allDigitsOdd(number))
            System.out.println("All the digits are odd!");
        else
            System.out.println("There are even digits among them!");
    }

    private static boolean allDigitsOdd(int[] digits) {
        //odd set to true by default
        boolean odd = true;
        //checks if any number in the array divided by two had a remainder of 0
        //i.e. if any number is eveer
        for(int i = 0; i < digits.length; i++){
            if(digits[i] % 2 == 0)
                //if theres an even number sets odd to false
                odd =  false;
        }
        //returns odd
        return odd;
    }
}
