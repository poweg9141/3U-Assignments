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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);
        //asks name
        System.out.println("What is your name?: ");
        //prints out hello plus whatever they typed in
        System.out.println("Hello " + input.nextLine());
    }
}
