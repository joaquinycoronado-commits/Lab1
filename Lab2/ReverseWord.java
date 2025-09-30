package Lab2;
import java.util.Scanner;

/**
 * This program will identify whether each word in a line of 
 * words can be spelled backwards by taking the first letter
 * and placing it at the end.
 * 
 *
 * @author joaquinycoronado@gmail.com
 * @since 9/28/2025
 * @version v1.0
 */
public class ReverseWord
{
    public static void main(String[] args){
        String word, remaining, combined, flipped;
        char firstLetter;
        
        Scanner keyboard = new Scanner(System.in);
    
        do {
            System.out.print("Enter each word you want to test, then enter quit to run the test: ");
            word = keyboard.next().toLowerCase();
            System.out.println("");
            while(!word.equals("quit")){
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;
                flipped="";
                
                for (int i = combined.length()-1;i>=0;i--)
                    flipped += combined.charAt(i);
        
                if(word.equals(flipped))
                    System.out.println(word + " works");
                else
                    System.out.println(word + " does not work");
                word = keyboard.next().toLowerCase();
                }
            System.out.print("Would you like to test another list of words? (if so, enter yes): ");    
    } while (keyboard.next().equalsIgnoreCase("yes"));
}
}