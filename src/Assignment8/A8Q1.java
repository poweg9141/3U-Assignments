package Assignment8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author poweg9141
 */
public class A8Q1 extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // GAME VARIABLES WOULD GO HERE
    boolean satan = false;
    //creates and sets new colours for the drawing
    Color skinny = new Color(255, 220, 177);
    Color lips = new Color(255, 207, 207);
    Color nosey = new Color(158, 130, 96);
    Color hairy = new Color(106, 78, 66);
    int pupilXR = 460;
    int pupilXL = 300;
    int LipTop = 450;
    int LipBottom = 450;
    int direction = 1;
    int lipDirTop = 1;
    int lipDirBottom = 1;

    // GAME VARIABLES END HERE   
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);



        // GAME DRAWING GOES HERE 

        g.setColor(skinny);
        //fills an oval for the main face
        g.fillOval(200, 0, 400, 600);
        //fills two ovals for the ears
        g.fillOval(140, LipTop - 250, 100, 150);
        g.fillOval(560, LipTop - 250, 100, 150);
        //draws the top teeth
        g.setColor(Color.WHITE);
        g.fillRect(330, 450, 25, 25);
        g.fillRect(358, 450, 25, 25);
        g.fillRect(386, 450, 25, 25);
        g.fillRect(414, 450, 25, 25);
        g.fillRect(442, 450, 25, 25);
        g.fillRect(470, 450, 25, 25);
        //draws the bottom teeth
        g.fillRect(330, 480, 25, 25);
        g.fillRect(358, 480, 25, 25);
        g.fillRect(386, 480, 25, 25);
        g.fillRect(414, 480, 25, 25);
        g.fillRect(442, 480, 25, 25);
        g.fillRect(470, 480, 25, 25);
        //draws the cover for the teeth
        g.setColor(skinny);
        g.fillRect(330, LipTop, 180, 25);
        g.fillRect(330, LipBottom + 30, 180, 30);
        //sets the colour for the lips 
        if (satan == true) {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(lips);
        }
        //draws the lips
        g.fillArc(400, LipTop, 100, 50, 0, 180);
        g.fillArc(320, LipTop, 100, 50, 0, 180);
        g.fillArc(320, LipBottom, 180, 50, 180, 180);

        //draws the outer eyes
        g.setColor(Color.WHITE);
        g.fillOval(270, 210, 100, 50);
        g.fillOval(430, 210, 100, 50);

        //draw the pupils
        if (satan == true) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLUE);
        }
        g.fillOval(pupilXR, 215, 40, 40);
        g.fillOval(pupilXL, 215, 40, 40);
        g.setColor(Color.BLACK);
        g.fillOval(pupilXR + 5, 220, 30, 30);
        g.fillOval(pupilXL + 5, 220, 30, 30);
        //draws the nose
        g.setColor(nosey);
        g.drawArc(350, 200, 100, 200, 180, 180);
        //draws the bowl hair-cut
        if (satan == true) {
            g.setColor(Color.MAGENTA);
        } else {
            g.setColor(hairy);
        }
        g.fillArc(200, 1, 400, 400, 0, 180);






        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            if (pupilXL < 270) {
                direction = 1;
            } else if (pupilXL + 40 > 370) {
                direction = -1;
            }

            if (LipTop < 420) {
                lipDirTop = 1;
                lipDirBottom = -1;
            } else if (LipTop >= 450) {
                lipDirTop = -1;
                lipDirBottom = 1;
            }
            
            

            pupilXR = pupilXR + direction;
            pupilXL = pupilXL + direction;
            LipTop = LipTop + lipDirTop;
            LipBottom = LipBottom + lipDirBottom;

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("The Manless Face");

        // creates an instance of my game
        A8Q1 game = new A8Q1();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        game.addMouseListener(new Mouse());

        // starts the game loop
        game.run();
    }

    // Used to implement any of the Mouse Actions
    private static class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private static class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
}