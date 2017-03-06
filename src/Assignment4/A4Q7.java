/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //puts player on square one
        int pos = 1;
        //initialize roll int
        int roll = 0;
        //set rolled to false
        boolean rolled = false;
        //welcomes user
        System.out.println("Welcome to snakes and Ladders!");

        //play label so code can break out of two loops
        play:
        while (true) {
            //while rolled is false
            while (rolled == false) {
                //asks user to enter dice number and stores it
                System.out.println("Please roll the dice and enter the number: ");
                roll = in.nextInt();
                //refers to method to check what they rolled
                //if 0 is entered they quit and loop is broken
                if (checkRoll(roll) == 0) {
                    System.out.println("You Quit!");
                    break play;
                    //if the number entered is impossible makes them enter it again
                } else if (checkRoll(roll) == 2) {
                    System.out.println("Impossible dice sum");
                } else {
                    //if the number is possible and they didnt quit rolled is true
                    //set to true so while loop does not repeat
                    rolled = true;
                }
            }
            //newPos method finds the new position of the player and sets it to their pos
            int newPosition = findPos(pos, roll);
            pos = newPosition;
            //prints out their new pos
            System.out.println("You are now on square " + pos + "!");
            //if its 100 they win and play loop breaks
            if(pos == 100){
                System.out.println("You Win!!");
                break play;
            }
            //rolled is set to false so user will be asked to input dice again
            rolled = false;
        }

    }

    //method checks if the roll is possible
    private static int checkRoll(int dice) {
        //initializes state int
        int state;
        //if they rolled 0 return 0
        if (dice == 0) {
            state = 0;
        // if they rolled outside of the possible options returns 2
        } else if (dice < 2 || dice > 12) {
            state = 2;
        //otherwise returns 1
        } else {
            state = 1;
        }
        return state;
    }

    //method to find the new position of the player
    private static int findPos(int place, int dice) {
        //newPos is their place plus whatever they rolled
        int newPos = place + dice;
        //checks if the player landed on a snake or ladder
        //adjusts their position accordingly
        switch (newPos) {
            case 54:
                newPos = 19;
                System.out.println("You hit a snake!");
                break;
            case 90:
                newPos = 48;
                System.out.println("You hit a snake!");
                break;
            case 99:
                newPos = 77;
                System.out.println("You hit a snake!");
                break;
            case 9:
                newPos = 34;
                System.out.println("You hit a ladder!");
                break;
            case 40:
                newPos = 64;
                System.out.println("You hit a ladder!");
                break;
            case 67:
                newPos = 86;
                System.out.println("You hit a ladder!");
                break;
        }
        //if their new pos is over 100 they dont move
        if(newPos > 100){
            newPos = place;
            //tells the player they cant move
            System.out.println("You rolled to high and can't move!");
        }
        //returns their new position
        return newPos;
    }
}
