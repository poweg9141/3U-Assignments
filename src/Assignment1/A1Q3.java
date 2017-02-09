/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author poweg9141
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();
        Robot bob = new Robot(kitchener, 3, 0, Direction.EAST);
        new Thing(kitchener, 3, 1);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        for(int i = 0; i < 3; i++)
            bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        for(int e = 0; e < 3; e++)
            bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.move();
        for(int o = 0; o < 3; o++)
            bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        for(int a=  0; a < 3; a++)
            bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        
    }
}
