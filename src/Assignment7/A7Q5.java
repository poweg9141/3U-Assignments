/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks how many lines
        System.out.println("How many lines of chaos?:");
        //runs chaotic method
        chaotic(in.nextInt());
        //prints out you're welcome
        System.out.println("You're Welcome!");
    }

    private static void chaotic(int lines) {
        //creates a new random int
        Random rand = new Random();
        //prints out a random amout of * from 1 to 5 for every line
        for (int i = 0; i < lines; i++) {
            int length = rand.nextInt(5) + 1;
            for(int o = 0; o < length; o++)
                System.out.print("* ");
            //new line to separate lines of *
            System.out.println("");
        }
    }
}
