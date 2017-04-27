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
//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ans1 = FindLetter(new char[] { 'a','b','c','d','f' });
        String ans2 = (FindLetter(new char[] { 'O','Q','R','S' }));
        System.out.println(ans1 + "\n" + ans2);
        
    }
    
    private static String FindLetter(char[] array){
        String missing = "";
        for(int count = Character.getNumericValue(array[0]); count < array.length; count++){
            if(Character.getNumericValue(array[count]) != count){
                 if(Character.isUpperCase(array[0]))
                     missing = String.valueOf(count).toUpperCase();
                 else
                     missing = String.valueOf(count).toLowerCase();
            }
        }
        return missing;
    }
}
