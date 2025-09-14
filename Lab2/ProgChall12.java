package Lab2;
import java.util.Scanner;

/**
 * This is a demonstration of the scanner tool in which I will be writing the
 * city im in right now.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/13/2025
 * @version v1.0
 */
public class ProgChall12
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a city: ");
        String cityInput = scanner.nextLine();
    
        System.out.println();
        System.out.println("The city entered has: " + cityInput.length()
        + " chars");
        System.out.println("In upper case: " + cityInput.toUpperCase());
        System.out.println("In lower case: " + cityInput.toLowerCase());
        System.out.println("First character: " + cityInput.charAt(0));
        
        scanner.close();
    }
}