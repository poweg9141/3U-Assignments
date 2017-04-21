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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner in = new Scanner(System.in);
        //asks how many numbers they want to organize and stores it as an int
        System.out.println("How many numbers do you want to organize? ");
        int count = in.nextInt();
        //makes an array with the same amount of elements as number needed to be organized
        int marks[] = new int[count];
        //asks user to input numbers
        System.out.println("Please input the numbers separated by spaces:");

        //stores each number in a corresponding array element
        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }

        //goes through each spot in the array
        for (int arraySpot = 0; arraySpot < marks.length; arraySpot++) {
            //if any spot ahead of the variable arraySpot is smaller than it...
            for (int i = arraySpot; i < marks.length; i++) {
                if (marks[arraySpot] > marks[i]) {
                    //switches the two elements spots in the array
                    int temp = marks[i];
                    marks[i] = marks[arraySpot];
                    marks[arraySpot] = temp;
                }
            }
        }
        //prints out the organized array to the screen
        System.out.println("The organized array is displayed below:");
        for (int num : marks) {
            System.out.print(num + " ");
        }

        //finds the middle of the array
        double mid = (marks.length) / 2.0;
        //if the middle has no remainder
        if (mid % 1 == 0) {
            //calculates and prints out the media
            int pos = (int) mid;
            double media = (marks[pos - 1] + marks[pos]) / 2;
            System.out.printf("\nThe media is %s.\n", media);
        } else {
            //if it has a remainder
            //calculates and prints out the medium
            double spot = mid - 0.5;
            double medium = marks[(int) spot];
            System.out.printf("\nThe medium is %s.\n", medium);
        }
    }
}
