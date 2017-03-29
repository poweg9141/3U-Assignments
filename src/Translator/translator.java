/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Translator;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Pig Latin Translator.\nEnter a blank input at any time to stop.");
        while(true){
            System.out.println("Enter a phrase to translate: ");
            String delims = "[,.?1! ]";
            String vowels = "aeiou";
            String input = in.nextLine();
            if(input.isEmpty())
                break;
            String[] words = input.split(delims);
            
            
            for(int i = 0; i < words.length; i++){
                String word = words[i];
                if(vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1){
                    word = word + "way ";
                }else{
                    int place = 0;
                    for(int o = 0; o < word.length(); o++){
                        char letter = word.charAt(o);
                        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'){
                             place = o;
                             break;
                        }  
                    }
                    word = word.substring(place, word.length()) + word.substring(0, place) + "ay ";
                }
                words[i] = word;
            }
            for(int i = 0; i < words.length; i++){
                System.out.print(words[i]);
            }
            System.out.println("");
        }
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
