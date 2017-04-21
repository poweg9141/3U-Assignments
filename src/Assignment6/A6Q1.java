/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author poweg9141
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks how many students in the class
        System.out.println("How many students are in the class?:");
        //saves the input number in the int students
        int students = in.nextInt();
        //creates an array with the same amount of elements as students
        double marks[] = new double[students];
        //asks user to input marks
        System.out.println("Enter the makrs:");
        //takes in one mark for every student and stores it in the corresponding array element
        for (int i = 0; i < students; i++) {
            marks[i] = in.nextDouble();
        }
        //initializes the oduble average
        double average = 0;
        //adds the number in each element of the array to average
        for (int i = 0; i < marks.length; i++) {
            average += marks[i];
        }
        //divides average by the amount of marks entered
        average = average / students;
        //decimal format created to format a number to have two decimal places
        DecimalFormat f = new DecimalFormat("###.##");
        //prints out the answer
        //decimal format applied to the double average when it is printed out
        System.out.println("The average is " + f.format(average) + " %");
    }
}
