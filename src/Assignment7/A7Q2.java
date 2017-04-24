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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks for and stores an integer mark
        System.out.println("Please enter a mark:");
        int marks = (int) in.nextDouble();
        //prints out the return of the Grade mathod
        System.out.println("The grade associated with it is " + Grade(marks));
    }
    
    private static char Grade(int mark){
        //assigns a character based of a mark
        char grade = 'x';
        if(mark < 50)
            grade = 'F';
        else if(mark <= 59)
            grade = 'D';
        else if(mark <= 69)
            grade = 'C';
        else if(mark <= 79)
            grade = 'B';
        else if(mark >= 80)
            grade = 'A';
        //returns that character
        return grade;
    }
}
