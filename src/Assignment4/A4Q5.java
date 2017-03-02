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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner in = new Scanner(System.in);
        //asks for and scores name
        System.out.println("Please enter your name:");
        String name = in.nextLine();
        //asks how many tests were written adn stores it as an array
        System.out.println("How many tests did you write?:");
        double[] tests = new double[in.nextInt()];
        //for each element in the array asks how much the test was out of 
        //and how much they got
        for (int i = 0; i < tests.length; i++) {
            int testNum = i + 1;
            System.out.println("What was test " + testNum + " out of?:");
            double denom = in.nextInt();
            System.out.println("What did you get?:");
            double numer = in.nextInt();
            //find the percent score on that test and stores it to the 
            //corresponding element in the array
            tests[i] = (numer / denom) * 100;
        }
        //prints out test score header
        System.out.println("Test scores for " + name);
        int total = 0;
        //prints out the number stored in each element of the array
        for (int i = 0; i < tests.length; i++) {
            int testNum = i + 1;
            System.out.println("Test " + testNum + ": " + tests[i] + "%");
            //adds each element together to get a total
            total += tests[i];
        }
        //divides the total by the amount of tests to find the average
        double av = total / tests.length;
        //prints out the average
        System.out.println("Average: " + av + "%");

    }
}
