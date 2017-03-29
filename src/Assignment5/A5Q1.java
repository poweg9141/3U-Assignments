/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        

        System.out.println("Welcome to HangMan");
        boolean player = true;
        boolean win;
        int p1points = 0;
        int p2points = 0;
        int guess = 5;

        game:
        while (true) {
            int guesser;
            if(player == true){
                System.out.println("Player 2 please enter the word:");
                guesser = 1;
            }else{
                System.out.println("Player 1 please enter the word:");
                guesser = 2;
            }
            Scanner in = new Scanner(System.in);
            String word = in.nextLine();
            String hiddenWord = "";
            for (int i = 0; i < word.length(); i++) {
                hiddenWord += "_";
            }
            boolean guessed = false;
            while (guessed == false) {
                System.out.println(hiddenWord);
                System.out.printf("\nYou have %s guesses left. Please guess a letter player %s:\n", guess, guesser);
                String letter = in.next();
                boolean right = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter.charAt(0)) {
                        right = true;
                        hiddenWord = hiddenWord.substring(0, i) + letter + hiddenWord.substring(i + 1, hiddenWord.length());
                    }
                }
                if (right != true) {
                    if(guess != 0){
                    guess = guess - 1;
                    System.out.printf("\nNope, you now have %s guesses left", guess);
                    }else if(guess == 0){
                        System.out.println("You are out of guesses. You lose!");
                        win = false;
                    }
                }
                System.out.println(hiddenWord);
                System.out.println("");

                if (hiddenWord.equalsIgnoreCase(word)) {
                    guessed = true;
                }
            }
            System.out.println("You Win!!");
            System.out.println("Type anything to keep playing, enter 'e' to stop");
            win = true;
            if(in.next().equalsIgnoreCase("e"))
                break game;
            else{
                guess = 5;
                if(win == true && player == true){
                    p1points += 1;
                    player = false;
                }
                else if(win == true && player == false){
                    p2points += 1;
                    player = true;
                }
                else if(win == false && player == true){
                    p2points += 1;
                    player = false;
                }
                else if(win == false && player == false){
                    p1points += 1;
                    player = true;
                }
            }
        }
    }
}
