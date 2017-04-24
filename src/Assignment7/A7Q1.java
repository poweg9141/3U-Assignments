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
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks for and stores a radius
        System.out.println("Please enter the radius of the circle:");
        double radius = in.nextDouble();
        //prints out the returned number of the radius method
        System.out.println("The area of the circle is " + Radius(radius));
        
    }
    
    private static double Radius(double rad){
        //calculates and returns the radius
        double area = Math.PI*Math.pow(rad, 2);
        return area;
    }
}
