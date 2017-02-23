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

/**
 *
 * @author poweg9141
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new city and two robots
        City kw = new City();
        Robot bob = new Robot(kw, 0, 0, Direction.EAST);
        Robot joe = new Robot(kw, 1, 0, Direction.EAST);
        
        //create bobs obsticles
        new Thing(kw, 0, 2);
        new Thing(kw, 0, 3);
        new Wall(kw, 0, 4, Direction.WEST);
        
        //create joes obsticles
        new Wall(kw, 1, 4, Direction.EAST);
        new Thing(kw, 1, 5);
        
        //bob moves to the first thing
        while(bob.frontIsClear() && !bob.canPickThing())
            bob.move();
        
        //joe moves to the first obsticle
        while(joe.frontIsClear() && !joe.canPickThing())
            joe.move();
        
    }
}
