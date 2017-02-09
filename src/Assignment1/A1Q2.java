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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();//creating new city called kitchener
        Robot bob = new Robot(kitchener, 1, 2, Direction.SOUTH);//creating new robot called bob
        new Wall(kitchener, 1, 2, Direction.NORTH);//making the walls for the city
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Thing(kitchener, 2, 2);//making the 'newspaper; and 2, 2 
        
        for(int i = 0; i < 3; i++)//making bob turn left three times so he is facing west
            bob.turnLeft();
        for(int e = 0; e < 3; e++){//making bob turn left and move three times
            bob.move();
            bob.turnLeft();
        }
        bob.pickThing();//making bob pick up paper
        bob.turnLeft();//bob turns left
        for(int o = 0; o < 3; o++){//bob moves then turns left three times then repeats three times
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
        }
    }
}
