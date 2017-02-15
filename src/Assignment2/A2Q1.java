/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author poweg9141
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //making a new city and robot
        City kw = new City();
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        
        //spawning 10 things in from avenue 2 to 11
        for(int i = 0; i < 10; i++){
            new Thing(kw, 1, 2+i);
        }
        
        //moving bob into place
        bob.move();
        
        //checking if bob has less than 7 things in his bag
        while(bob.countThingsInBackpack() < 7){
            //if bob can pick up a thing
            if(bob.canPickThing())
                //bob picks a thing
                bob.pickThing();
            //bob moves to the next space
            bob.move();
        }
        //while loo ends when bob has 7 things in bag
        
        //while bob can pickup something
        while(bob.canPickThing())
            //bob moves
            bob.move();
        //while loop ends when there is no thing on the next space
    }
}
