/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Random;

/**
 *
 * @author poweg9141
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    //boolean to be used by program, do not change
    private static boolean done;
    //ints to set width and height
    static final int width = 5;
    static final int height = 4;

    public static void main(String[] args) {

        City kw = new City();
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        //spawns the top wall
        for (int i = 0; i < width; i++) {
            new Wall(kw, 1, 1 + i, Direction.NORTH);
        }

        //spawns the left wall
        for (int i = 0; i < height; i++) {
            new Wall(kw, 1 + i, 1, Direction.WEST);
        }

        //spawns the right wall
        for (int i = 0; i < height; i++) {
            new Wall(kw, 1 + i, width, Direction.EAST);
        }

        //spawns bottom wall
        for (int i = 0; i < width; i++) {
            new Wall(kw, height, i + 1, Direction.SOUTH);
        }

        //spawns the trash
        //spawns trash in the y axis
        for (int y = 0; y < height; y++) {
            //if SpawnTrash returns 1
            if (SpawnTrash() == 1) {
                //spawns as as many trash items as the Trash method returns
                for (int trash1 = 0; trash1 < Trash(); trash1++) {
                    new Thing(kw, y + 1, 1);
                }
            }
            //spawns the trash in the x axis
            for (int x = 0; x < width; x++) {
                //if SpawnTrash returns 1
                if (SpawnTrash() == 1) {
                    //spawns as as many trash items as the Trash method returns
                    for (int trash2 = 0; trash2 < Trash(); trash2++) {
                        new Thing(kw, y + 1, x + 1);
                    }
                }
            }
        }

        //bob moves to clean trash
        while (true) {
            //while bob can pick a thing he does
            while (bob.canPickThing()) {
                bob.pickThing();
            }
            //if the fron is clear bob moves
            if (bob.frontIsClear()) {
                bob.move();
            } else {
                //if its not clear get bobs direction
                if (bob.getDirection() == Direction.EAST) {
                    //if bobs direction is east call the east trun class
                    EastTurn(bob);
                    //if done is true break the while true loop
                    if (done == true) {
                        break;
                    }
                    //if bobs direction is west call the west turn class
                } else if (bob.getDirection() == Direction.WEST) {
                    WestTurn(bob);
                    //if done is true break the while true loop
                    if (done == true) {
                        break;
                    }
                }
            }
        }
    }

    //decides whether or not to spawn trash
    private static int SpawnTrash() {
        Random rand = new Random();
        //picks a number between 1 ans 2
        int spawn = rand.nextInt(2) + 1;
        return spawn;
    }

    //if trash is spawned at an intersection, this decides how much
    private static int Trash() {
        Random rand = new Random();
        //picks a number between 1 and 3
        int num = rand.nextInt(3) + 1;
        return num;
    }

    //class called when bob hits a wall facing east
    private static void EastTurn(Robot name) {
        //turns left three times i.e. right
        for (int i = 0; i < 3; i++) {
            name.turnLeft();
        }
        //if the fron is clear bob moves and turns right again
        if (name.frontIsClear()) {
            name.move();
            for (int i = 0; i < 3; i++) {
                name.turnLeft();
            }
            //done is now false
            done = false;
            //if the front is not clear done is true
        } else {
            done = true;

            name.turnLeft();
            name.turnLeft();
            for (int i = 0; i < height -1; i++) {
                name.move();
            }
                name.turnLeft();

            for(int i = 0; i < width -1; i++)
                name.move();
            
            name.turnLeft();
            name.turnLeft();
        }
    }

    //class called when bob hits a wall facing west
    private static void WestTurn(Robot name) {
        //turns left
        name.turnLeft();
        //if the fron is clear bob moves and turns left again
        if (name.frontIsClear()) {
            name.move();
            name.turnLeft();
            //done is now false
            done = false;
            //if the front is not clear done is true
        } else {
            done = true;
            
            name.turnLeft();
            name.turnLeft();
            
            for(int i = 0; i < height - 1; i++)
                name.move();
            for(int i = 0; i < 3; i++)
                name.turnLeft();
        }
    }
}
