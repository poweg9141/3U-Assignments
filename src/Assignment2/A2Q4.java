/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author poweg9141
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new city and robot
        City kw = new City();
        Robot bob = new Robot(kw, 0, 0, Direction.EAST);
        
        //creates the castle
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);
        
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        
        //moves bob into position
        bob.move();
        bob.move();
        //calls 'Right' method
        Right(bob);
        bob.move();
        bob.turnLeft();
        //loops forever
        while(true){
            //moves bob forward while the front is clear
            while(bob.frontIsClear())
                bob.move();
            //if the front is not clear calls 'roundTower' method
            roundTower(bob);
        }
    }
    //Right method turns bob left three times, i.e. a right turn
    private static void Right(Robot name){
        for(int i = 0; i < 3; i++)
            name.turnLeft();
    }
    
    //makes bob round a tower
    private static void roundTower(Robot name){
        //bob turns left and moves
        name.turnLeft();
        name.move();
        //for the first two corners of the tower bob turns right and moves twice
        for(int i = 0; i < 2; i++){
            Right(name);
            name.move();
            name.move();
        } 
        //bob turns right
        Right(name);
        //bob moves
        name.move();
        //bob turns left
        name.turnLeft();
    }
}
