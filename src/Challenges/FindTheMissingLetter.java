/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author poweg9141
 */
public class FindTheMissingLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(FindLetter(new char[] { 'a','b','c','d','f' }));;
        System.out.println(FindLetter(new char[] { 'O','Q','R','S' }));;
        
    }
    
    private static char FindLetter(char[] array){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char missing = ' ';
        for(int count = Character.getNumericValue(array[0]); count < array.length; count++){
            if(!(alphabet.charAt(count) == array[count])){
                 missing = alphabet.charAt(count);
                break;
            }
        }
        return missing;
    }
}
