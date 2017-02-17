/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
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

        City kw = new City();
        Robot bob = new Robot(kw, 0, 2, Direction.SOUTH);
        Robot joe = new Robot(kw, 0, 2, Direction.SOUTH);

        //dictates length of road, can be adjusted, cnat be less than 3
        int roadLength = 10;
        //yPos to be adjusted by program
        int yPos = 1;
        //snowChance determines the probability of spawning snow, must be higher than 1
        int snowChance = 3;

        //spawns new wall for road facing west
        for (int i = 0; i < roadLength; i++) {
            new Wall(kw, i, 0, Direction.WEST);
        }

        //spawns new walls for other side of road facing west
        for (int i = 0; i < roadLength; i++) {
            new Wall(kw, i, 2, Direction.WEST);
            //spawns snow if the snow method returns a number other than 1
            if (snow(snowChance) != 1) {
                new Thing(kw, i, 2);
            }
        }
        //creates the first wall of the sidewalk
        new Wall(kw, 0, 2, Direction.EAST);
        //created the top of the sidewalk
        new Wall(kw, 0, 2, Direction.NORTH);

        //WHILE LOOP TO RANDOMLY GENERATE DRIVEWAYS
        while (yPos + 1 < roadLength) {
            int length = driveLength();
            //create top of driveway
            for (int i = 0; i < length; i++) {
                new Wall(kw, yPos, i + 3, Direction.NORTH);
                //spawns snow if the snow method returns a number other than 1
                if (snow(snowChance) != 1) {
                    new Thing(kw, yPos, i + 3);
                }
            }
            int width = driveWidth();
            //create end of driveway
            for (int i = 0; i < width; i++) {
                new Wall(kw, yPos + i, length + 2, Direction.EAST);
            }
            yPos = yPos + width - 1;
            //create bottom of driveway
            for (int i = 0; i < length; i++) {
                new Wall(kw, yPos, i + 3, Direction.SOUTH);
                //spawns snow if the snow method returns a number other than 1
                if (snow(snowChance) != 1) {
                    new Thing(kw, yPos, i + 3);
                }
            }
            //create break between driveways
            int sep = driveBreak();
            for (int i = 0; i < sep; i++) {
                new Wall(kw, yPos + 1, 2, Direction.EAST);
            }
            yPos = yPos + 2;
        }
        //creates the stopping wall for the robot
        new Wall(kw, yPos - 1, 2, Direction.SOUTH);

        //ROBOT MOVING CODE
        //boolean used to determine where bob should turn after trying to clear driveway
        boolean clearedDrive;
        //while the sidewalk is clear bob moves and turns left
        while (bob.frontIsClear()) {
            bob.move();
            bob.turnLeft();
            //if there's a driveway bob moves down the driveway picking everything up
            if (bob.frontIsClear()) {
                while (bob.frontIsClear()) {
                    bob.move();
                    while (bob.canPickThing()) {
                        bob.pickThing();
                    }
                }
                //bob turns right
                Right(bob);
                //bob checks if the driveway is two wide
                if (bob.frontIsClear()) {
                    //if it is bob moves and clears the second part of the driveway
                    bob.move();
                    while (bob.canPickThing()) {
                        bob.pickThing();
                    }
                    Right(bob);
                    while (bob.frontIsClear()) {
                        bob.move();
                        while (bob.canPickThing()) {
                            bob.pickThing();
                        }
                    }
                    //if the front is not clear bob turns right and goes back down the driveway
                } else {
                    Right(bob);
                    while (bob.frontIsClear()) {
                        bob.move();
                    }
                }
                //after bob cleared a driveway clearedDrive is set to true
                clearedDrive = true;
            } else {
                //if there was no driveway for bob to clear clearedDrive is set to false
                clearedDrive = false;
                //bob turns right
                Right(bob);
            }
            //if clearedDrive is true bob turns left, putting him back on the sidewalk
            if (clearedDrive == true) {
                bob.turnLeft();
                //bob emptys everything in his bag onto the sidewalk
                while (bob.countThingsInBackpack() > 0) {
                    bob.putThing();
                }
            }
        }
        //Bob has cleared all the snow off the driveways

        //joe's turn to clear the snow off the sidewalk
        //while the front is clear joe picks up anything there and then moves forward one
        while (joe.frontIsClear()) {
            while (joe.canPickThing()) {
                joe.pickThing();
            }
            joe.move();
        }
        //when joe runs out of sidewalk he emptys his bag onto the last sidewalk
        while (joe.countThingsInBackpack() > 0) {
            joe.putThing();
        }

    }

    //method used to randomly generate the break between the driveways, can be either 1 or 2
    private static int driveBreak() {
        int size = rand.nextInt(2) + 1;
        return size;
    }

    //method used to randomly generate the length of the driveways. can be from 3 to 5
    private static int driveLength() {
        int length = rand.nextInt(3) + 3;
        return length;
    }

    //method used to randomly generate the width of the driveways, can be 1 or 2
    private static int driveWidth() {
        int width = rand.nextInt(2) + 1;
        return width;
    }

    //method used to randomly generate the snow on the driveways and sidewalk
    //chance determined by the snowChance int
    private static int snow(int chance) {
        int snow = rand.nextInt(chance) + 1;
        return snow;
    }

    //method used to turn bob right
    private static void Right(Robot name) {
        //turns bob left 3 times, i.e. a right turn
        for (int i = 0; i < 3; i++) {
            name.turnLeft();
        }
    }
}