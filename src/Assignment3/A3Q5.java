/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author poweg9141
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int to set amount of things to spawn
        int things = 10;
        
        //sets how far from the first things bob moves
        int move = 1;
        
        //new city and robots
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);
        //shows the amount of things in a pile
        kw.showThingCounts(true);
        
        //spawns things based on int things
        for(int i = 0; i < things; i++){
            new Thing(kw, 1, 1);
        }
        
        //while bob can pick up something
        while(bob.canPickThing()){
            //bob picks a thing and moves
            bob.pickThing();
            bob.move(move);
            //bob puts a thing and turns around
            bob.putThing();
            bob.turnAround();
            //bob moves and turns around
            bob.move(move);
            bob.turnAround();
        }
        //when bob can no longer pick a thing, bob moves to the new pile of things
        bob.move(move);
    }
}
