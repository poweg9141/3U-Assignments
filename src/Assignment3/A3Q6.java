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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new city and robot
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 0, 1, Direction.SOUTH);
        //shows how many things at an intersection
        kw.showThingCounts(true);

        //integer array, each number is the amount of things to be spawned per column
        //NOTE: these number can be changed or more can be added
        int[] graph = new int[]{3,2,5,4};
        
        for(int count = 0; count < graph.length; count++){
            for(int i = 0; i < graph[count]; i++)
                new Thing(kw, count + 1, 1);
        }
        //bob moves into position
        bob.move();
        //while bob can pick a thing
        while(bob.canPickThing()){
            //bob picks everything
            bob.pickAllThings();
            //bob turns left
            bob.turnLeft();
            //while bob has something in his backpack
            while(bob.countThingsInBackpack() > 0){
                //bob puts a thing and moves
                bob.putThing();
                bob.move();
            }
            //when bob has nothing in his packpack he turns around
            bob.turnAround();
            //while bob is not a avenue 1 he moves
            while(bob.getAvenue() != 1)
                bob.move();
            //when he gets to avenue 1 he turns left
            bob.turnLeft();
            //bob moves into position for the next bar
            bob.move();
        }
    }
}
