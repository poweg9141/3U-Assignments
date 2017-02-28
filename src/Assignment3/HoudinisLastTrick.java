/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author poweg9141
 */
public class HoudinisLastTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot bob = new Robot(kw, 1, 1, Direction.NORTH);
        
        for(int i = 0; i < 3; i++)
            bob.turnLeft();
        bob.pickThing();
    }
}
