/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.util.Random;

/**
 *
 * @author poweg9141
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    static Random rand = new Random();

    public static void main(String[] args) {

        int roadLength = 10;
        int yPos = 1;

        City kw = new City();
        Robot bob = new Robot(kw, 0, 2, Direction.SOUTH);
        Robot joe = new Robot(kw, 0, 2, Direction.SOUTH);

        for (int i = 0; i < roadLength; i++) {
            new Wall(kw, i, 0, Direction.WEST);
        }
        for (int i = 0; i < roadLength; i++) {
            new Wall(kw, i, 1, Direction.EAST);
        }
        new Wall(kw, 0, 2, Direction.EAST);
        //create first driveway
        int length1 = driveLength();
        for (int i = 0; i < length1; i++) {
            new Wall(kw, yPos, length1 + 3, Direction.NORTH);
        }
    }

    private static int Break() {
        int size = rand.nextInt(2) + 1;
        return size;
    }

    private static int driveLength() {
        int length = rand.nextInt(3) + 3;
        System.out.println("length: " + length);
        return length;
    }

    private static int driveWidth() {
        int width = rand.nextInt(2) + 1;
        System.out.println("width: " + width);
        return width;
    }
}
