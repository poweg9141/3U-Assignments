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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks user for month and day and stores it
        System.out.println("What is the month?:");
        int month = in.nextInt();
        System.out.println("What is the day?:");
        int day = in.nextInt();
        //prints out the result of the season class
        System.out.println("The season is " + season(month, day));
    }

    private static String season(int month, int day) {
        //creates a numerical representation of the date
        int dateValue = (month * 100) + day;
        //new String
        String season = "";
        //checks what dateValue equals to find the season
        if(dateValue < 315 || dateValue > 1216)
            season = "Winter";
        else if(dateValue < 615)
            season = "Spring";
        else if(dateValue < 915)
            season = "Summer";
        else if(dateValue < 1215)
            season = "Fall";
        //returns the season
        return season;
    }
}
