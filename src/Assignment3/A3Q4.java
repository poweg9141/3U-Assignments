/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.util.Random;

/**
 *
 * @author poweg9141
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    static final int width = 5;
    static final int height = 6;
    static final int perim = (height * 2) + (width * 2);
    static boolean opened;

    public static void main(String[] args) {

        City kw = new City();
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        //spawns the top wall
        for (int i = 0; i < width; i++) {
            int open = Wall();
            if(open == 1){
                continue;
            }else{
                new Wall(kw, 1, i +width, Direction.NORTH);
            }
            
        }
    }
    
    private static int Wall(){
        Random rand = new Random();
        int open;
        if(opened == false){
            open = rand.nextInt(perim) + 1;
        if(open == 1)
            opened = true;
        }else{
            open = 2;
        }
        return open;
    }
}
