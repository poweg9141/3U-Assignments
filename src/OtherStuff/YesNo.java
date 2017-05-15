/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OtherStuff;

import javax.swing.JOptionPane;

/**
 *
 * @author poweg9141
 */
public class YesNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane pane = new JOptionPane();
        pane.setMessage("Yes Or No?");
        pane.setSize(100, 50);
        pane.setVisible(true);
    }
}
