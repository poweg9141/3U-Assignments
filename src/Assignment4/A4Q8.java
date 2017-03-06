/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.awt.Color;
import java.awt.Transparency;
import javax.swing.JFrame;

/**
 *
 * @author poweg9141
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = "The Name Game";
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setName(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
