/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author poweg9141
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City kw = new City();
        RobotSE bob = new RobotSE(kw, 4, 0, Direction.EAST);

        //creating the walls for the mountain
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //new things placed on mountain
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //bob moves
        bob.move();

        //repeats code three times
        for (int i = 0; i < 3; i++) {
            //bob picks a thing, turns left, moves, turns right, and moves
            bob.pickThing();
            bob.turnLeft();
            bob.move();
            bob.turnRight();
            bob.move();
        }
        //bob picks a thing and moves
        bob.pickThing();
        bob.move();

        //repeats code three times
        for (int i = 0; i < 3; i++) {
            //bob puts a thing, bob moves, bob turns right, bob moves, bob turns left
            bob.putThing();
            bob.move();
            bob.turnRight();
            bob.move();
            bob.turnLeft();
        }

        //bob puts a thing and moves
        bob.putThing();
        bob.move();

    }
}
