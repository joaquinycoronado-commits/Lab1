package Lab2;
import java.util.Scanner;

/**
 * This program will identify the amount of times a certain letter appears in a phrase.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/28/2025
 * @version v1.0
 */
public class ProgChall5
{
    public static void main(String[] args){
        String phrase, character;
        int phrasechar, total = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        phrase = keyboard.nextLine().toLowerCase();
        System.out.println("");
        System.out.print("Enter a character to be assessed in the phrase: ");
        character = keyboard.next();
        while(character.length()>1) {
            System.out.print("Must enter a single character to be assessed. Try again: ");
            character = keyboard.next();
        }
        char testerchar = character.toLowerCase().charAt(0);
        for(phrasechar = 0;phrasechar<phrase.length();phrasechar++){
            if(phrase.charAt(phrasechar)==testerchar)
            total++;
    }
    System.out.println("In the phrase: " + phrase);
    System.out.print("There are " + total + " " + testerchar + ("'s"));
}
}

