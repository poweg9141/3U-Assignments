/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author poweg9141
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();//creating new city
        Robot bob = new Robot(kitchener, 0, 2, Direction.WEST);//creating new robot called bob
        new Wall(kitchener, 1, 2, Direction.NORTH);//creating the walls for the city
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        bob.move();//moving bob twice
        bob.move();
        for(int i = 0; i < 3; i++){//making bob turn left, move three times and repeat three times
            bob.turnLeft();
            bob.move();
            bob.move();
            bob.move();
        }
        bob.turnLeft();//bob turns left
        bob.move();//bob moves
    }
}
