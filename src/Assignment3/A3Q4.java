/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.util.Random;

/**
 *
 * @author poweg9141
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    static final int width = 5;
    static final int height = 6;
    static final int perim = (height * 2) + (width * 2);
    static boolean opened;

    public static void main(String[] args) {

        City kw = new City();
        RobotSE bob = new RobotSE(kw, 6, 1, Direction.EAST);

        //SPAWNS THE WALLS FOR THE BOX
        //spawns the top wall
        for (int i = 1; i <= width; i++) {
            int open = Wall();
            //if open = 1 skip this wall, otherwise generate one
            if (open == 1) {
                continue;
            } else {
                new Wall(kw, 1, i, Direction.NORTH);
            }
        }

        //spawns the left wall
        for (int i = 1; i <= height; i++) {
            int open = Wall();
            //if open = 1 skip this wall, otherwise generate one
            if (open == 1) {
                continue;
            } else {
                new Wall(kw, i, 1, Direction.WEST);
            }
        }

        //spawns the bottom wall
        for (int i = 1; i <= width; i++) {
            int open = Wall();
            //if open = 1 skip this wall, otherwise generate one
            if (open == 1) {
                continue;
            } else {
                new Wall(kw, height, i, Direction.SOUTH);
            }
        }

        //spawns the right wall except the last spot
        for (int i = 1; i < height; i++) {
            int open = Wall();
            //if open = 1 skip this wall, otherwise generate one
            if (open == 1) {
                continue;
            } else {
                new Wall(kw, i, width, Direction.EAST);
            }
        }

        //generates the last spot if an opening in the walls has already been made
        if (Wall() == 0) {
            new Wall(kw, height, width, Direction.EAST);
        }

        //BOB ESCAPES THE BOX
        
        //while statement to ensure if the break is directly in front of him he dosent go on forever
        while(bob.frontIsClear() && !(bob.getStreet() > height) && !(bob.getAvenue() > width))
            bob.move();
        bob.turnRight();
        
        //escape label
        escape:
        //while the front is clear he turns left
        while (true) {
            while (bob.frontIsClear()) {
                bob.turnLeft();
                //if the front is clear he escaped
                if (bob.frontIsClear()) {
                    break escape;
                }
                //if its noot he turns right and moves
                bob.turnRight();
                bob.move();
            }
            //when the front is not clear (he hit a corner)
            //bob turns left
            bob.turnLeft();
            //if the front is clear he escaped
            if (bob.frontIsClear()) {
                break escape;
            }
            //if its not he turns around
            bob.turnAround();
        }
        //if he escaped he moves once to put him outside the box
        bob.move();
    }

    //generates the random number to determine if there should be a space in the wall
    private static int Wall() {
        Random rand = new Random();
        int open;
        //if opened is false
        if (opened == false) {
            //generates a random number between 1 and the defined perimiter
            open = rand.nextInt(perim) + 1;
            //if the returned number is 1 opened is now true
            if (open == 1) {
                opened = true;
            }
            //if opened is true
        } else {
            //int open is 0
            open = 0;
        }
        //prints out the returned number allowing the user to see what is happening
        System.out.println("Wall: " + open);
        //returns the generated number
        return open;
    }
}