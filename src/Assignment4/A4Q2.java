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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);
        //asks to input inches
        System.out.println("How many inches?: ");
        //multiplys input by 2.54
        double cm = input.nextDouble() * 2.54;
        //outputs new number
        System.out.println("That is " + cm + " centimetres");
    }
}
