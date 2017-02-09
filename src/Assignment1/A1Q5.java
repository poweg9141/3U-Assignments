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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();//creates a new city
        Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);//creates a new robot
        karel.setLabel("K");//labels the robot
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        maria.setLabel("M");
        
        new Thing(kitchener, 0, 0);//makes new things
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        
        new Wall(kitchener, 3, 3, Direction.SOUTH);//adds new walls
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.WEST);
        
        karel.turnLeft();//karel turns left twice
        karel.turnLeft();
        karel.move();//karel and maria move
        maria.move();
        for(int i = 0; i < 3; i++)//karel turns left three times
            karel.turnLeft();
        maria.pickThing();//maria picks a thing
        karel.move();//karel moves and picks a thing
        karel.pickThing(); 
        karel.move();//karel moves
        maria.turnLeft();//maria turns left and moves
        maria.move();
        karel.pickThing();//karel and maria pick a thing
        maria.pickThing();
        maria.turnLeft();//karel and maria turn left
        karel.turnLeft();
        maria.move();//maria moves and picks a thing
        maria.pickThing();
    }
}
