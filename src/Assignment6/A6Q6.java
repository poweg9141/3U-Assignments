/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //new scanner
        Scanner in = new Scanner(System.in);
        //asks how many students in the class
        System.out.println("How many students are in the class?");
        int count = in.nextInt();
        //makes an array with the same amount of elements as marks needed to be organized
        double marks[] = new double[count];
        //asks user to input marks
        System.out.println("Please input the marks separated by spaces:");

        //stores each mark in a corresponding array element
        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }

        //goes through each spot in the array
        for (int arraySpot = 0; arraySpot < marks.length; arraySpot++) {
            //if any spot ahead of the variable arraySpot is smaller than it...
            for (int i = arraySpot; i < marks.length; i++) {
                if (marks[arraySpot] > marks[i]) {
                    //switches the two elements spots in the array
                    double temp = marks[i];
                    marks[i] = marks[arraySpot];
                    marks[arraySpot] = temp;
                }
            }
        }
        //calculates the average mark
        double avg = 0;
        for(int i = 0; i < marks.length; i++){
            avg += marks[i];
        }
        avg = avg/marks.length;
        //creates a new decimal format for 2 decimal places
        DecimalFormat f = new DecimalFormat("###.##");
        
        //outputs the lowest, highest and average mark
        System.out.println("The lowest mark is: " + marks[0] + "%");
        System.out.println("The highest marks is: " + marks[marks.length - 1] + "%");
        System.out.println("The average mark is: " + f.format(avg) + "%");
        //try's to be nice by asking the user for a cookie
        System.out.println("Would you like a cookie?");
        //crushes the users hopes of ever getting a cookie
        System.out.println("To bad, you don't get one! >:(");
        //NOTE: User may feel the need to go get a cookie after running this program
    }
}
