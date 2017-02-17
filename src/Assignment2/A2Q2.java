package Assignment2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Random;

/**
 *
 * @author poweg9141
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new city, robot, and Random object
        City kw = new City();
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        Random rand = new Random();
        //variable to be used later
        int finish = 0;
        //indicates the length of the race
        int raceLength = 10;
        
        //spawning in floors
        for(int i = 1; i < raceLength; i++){
            new Wall(kw, 1, i, Direction.SOUTH);
            //generating a random number between 1 and 2
            /*NOTE: the number inside rand.Next int indictaes chance
             * a wall will spawn, in this case 1/2
             */
            int hurdle = rand.nextInt(2) + 1;
            //if the random number is 1, spawn a hurdle
            if(hurdle == 1){
                new Wall(kw, 1, i, Direction.EAST);
            }
            //when the for loop finishes, this int will be the avenue beside the end of the course
            finish = i +1;
        }
        //spawns a floor and thing beside the end of the course
        new Wall(kw, 1, finish, Direction.SOUTH);
        new Thing(kw, 1, finish);
        
        //below is the moving section for bob
        //while bob can't pick a thing
        while(!bob.canPickThing()){
            //if the front is clear
            if(bob.frontIsClear())
                //bob moves
                bob.move();
            //if the front is not clear
            else{
                //bob moves around the hurlde
                bob.turnLeft();
                bob.move();
                //calls the method 'Right' found below
                Right(bob);
                bob.move();
                Right(bob);
                bob.move();
                bob.turnLeft();
            }
        }
    }
    //method takes input of Robot name
    private static void Right(Robot name){
        //turns the named robot left three times, i.e. a right turn
        for(int i = 0; i < 3; i++){
            name.turnLeft();
        }
    }
}
