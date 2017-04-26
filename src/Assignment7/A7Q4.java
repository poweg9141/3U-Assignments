/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's calculate compund interest!!");
        System.out.println("What's the prniciple amount?:");
        double initial = in.nextDouble();
        System.out.println("What's the interest rate in percent?:");
        double interest = in.nextDouble() / 100;
        System.out.println("How many years does this apply to?:");
        int time = in.nextInt();
        DecimalFormat f = new DecimalFormat("###.##");
        System.out.println("The compound interest is $" + f.format(compoundInterest(initial, interest, time)));   
    }

    private static double compoundInterest(double principle, double interest, int years) {

        double balance = principle * Math.pow((1 + interest), years);       
        return balance;
    }
}
