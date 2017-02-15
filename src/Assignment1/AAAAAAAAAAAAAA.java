/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;
import java.awt.Paint;

/**
 *
 * @author poweg9141
 */
public class AAAAAAAAAAAAAA {

    private static int count = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();
        Robot bob = new Robot(kitchener, 0, 0, Direction.EAST);
        bob.setLabel("Help Me!");
        Color gold = new Color(218, 165, 32);
        bob.setColor(gold);
        
        new Wall(kitchener, 0, 0, Direction.WEST);
        for(int count = 0; count < 50000; count++){
            new Wall(kitchener, 0, count, Direction.SOUTH);
            new Wall(kitchener, 0, count, Direction.NORTH);
        }
        new Wall(kitchener, 0, 50000, Direction.EAST);
        
        for(int i = 0; i < 15; i++){
            bob.move();
        }
        KYS(bob);
    }
    
    //run command KYS(*robot name*);
    private static void KYS(Robot name){
        new Wall(name.getCity(), name.getStreet(), name.getAvenue(), name.getDirection());
        name.move();
    }
}
