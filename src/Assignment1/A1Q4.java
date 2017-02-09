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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();//creating new city kitchener
        Robot bob = new Robot(kitchener, 0, 0, Direction.SOUTH);//creating 2 new robots, bob and joe
        Robot joe = new Robot(kitchener, 0, 1, Direction.SOUTH);
        
        new Wall(kitchener, 0, 1, Direction.WEST);//creating city walls
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        joe.move();//moving both robots
        bob.move();
        joe.turnLeft();//joe turns left
        bob.move();//moving bob twice, joe once
        joe.move();
        bob.move();
        for(int i = 0; i <3; i++)//joe turns left three times
            joe.turnLeft();
        bob.turnLeft();//moves bob twice, joe once
        joe.move();
        bob.move();
        for(int e = 0; e < 3; e++)//joe turns left thre times
            joe.turnLeft();
        bob.turnLeft();//bob turns left
        joe.move();//move both robots once
        bob.move();
        for(int o = 0; o < 3; o++)//bobo turns left three times
            bob.turnLeft();
    }
}
