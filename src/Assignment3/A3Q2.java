/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author poweg9141
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new city and robot
        City kw = new City();
        Robot bob = new Robot(kw, 0, 2, Direction.WEST);
        
        //new walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        
        //bob repeats eight times
        for(int counter = 0; counter < 8; counter++){
            //bob moves twice
            bob.move();
            bob.move();
            //bob turns left
            bob.turnLeft();
            //bob moves
            bob.move();
        }
    }
}
