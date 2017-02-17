package Assignment2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author poweg9141
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new city and robot
        City kw = new City();
        Robot bob = new Robot(kw, 13, 12, Direction.SOUTH);
        
        
        //if statements get direction of robot and change it to face north
        if(bob.getDirection() == Direction.SOUTH){
            bob.turnLeft();
            bob.turnLeft();
        }
        else if(bob.getDirection() == Direction.EAST){
            bob.turnLeft();
        }else if(bob.getDirection() == Direction.WEST){
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
        }
        //sets i to bobs street number, subracts 1 from i every time bob moves till i = 0
        for(int i = bob.getStreet(); i > 0; i--)
            bob.move();
        //turns bob left
        bob.turnLeft();
        //repeats first for statement with avenues
        for(int i = bob.getAvenue(); i > 0; i--)
            bob.move();
    }
}
