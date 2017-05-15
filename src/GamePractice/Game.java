/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePractice;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author poweg9141
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    static int WIDTH = 800;
    static int HEIGHT = 600;
    
    public static void main(String[] args) {
        //Creates a new JFrame object, the text in quotes is the title of the frame
        JFrame frame = new JFrame("New Game");
        //sets what the frame will do when the x button in the corner is pressed
        //this line makes the game close when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the width and height of the frame
        frame.setSize(WIDTH, HEIGHT);
        //sets where the frame will apear relative to the coordinates on the screen
        //null will set it to the center of the screen
        frame.setLocationRelativeTo(null);
        //makes the frame actually appear on the screen
        frame.setVisible(true);
        
        
        
        
    }
}
