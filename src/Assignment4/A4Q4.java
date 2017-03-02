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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);
        //asks the user how much each expense cost and adds their answer to the double cost
        System.out.println("How much do tickets cost?: ");
        double ticket = input.nextDouble();
        System.out.println("How much does the food for prom cost?:");
        double cost = input.nextDouble();
        System.out.println("How much does the DJ cost?:");
        cost += input.nextDouble();
        System.out.println("How much does it cost to rent the hall?:");
        cost += input.nextDouble();
        System.out.println("How much does decorations cost?:");
        cost += input.nextDouble();
        System.out.println("How much does it cost for staff?:");
        cost += input.nextDouble();
        System.out.println("How much for miscellaneous costs?:");
        cost += input.nextDouble();
        //divides the total costs by the cost of  ticket to find how many must be sold
        int tickets = (int)Math.ceil(cost / ticket);
        //prints the answer out to the user
        System.out.println("The total cost is $" + cost + ", You will need to sell " 
                + tickets + " tickes to break even");
    }
}
