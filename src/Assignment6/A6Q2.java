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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks how many people there are
        System.out.println("How many people are there");
        //stores the amoutn of people in the variable people
        int people = in.nextInt();
        //creates two arrays to store the peoples names and their heights
        String[] names = new String[people];
        double[] heights = new double[people];
        //initialized the double average
        double average = 0;

        //for every person
        for (int i = 0; i < people; i++) {
            //peopleNum is used to output the persons number startuing from one
            int peopleNum = i + 1;
            //asks the name of the person
            System.out.println("Please enter the name of person " + peopleNum + ":");
            //stores in in the corresponding element of the names array
            names[i] = in.next();
            //asks the height of the person
            System.out.println("How tall are they?: ");
            //stores in in the corresponding element of the heights array
            heights[i] = in.nextDouble();
            //adds that height to the average
            average += heights[i];
        }
        //divides the average by the amount of people
        average = average / people;
        //prints out the average height and tells the user the list of people over that height are listed below
        System.out.println("The average height is " + average);
        System.out.println("People over that height are listed below: \n");
        //for every person
        for (int i = 0; i < heights.length; i++) {
            //checks if they are taller then the average
            if (heights[i] > average) {
                //if they are prints out their name and their height
                System.out.println(names[i] + " at a height of " + heights[i]);
            }
        }
    }
}
