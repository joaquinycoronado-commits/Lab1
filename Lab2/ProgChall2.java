package Lab2;
import java.util.Scanner;

/**
 * This is a demonstration of the scanner tool in which I will be writing my 
 * name.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/13/2025
 * @version v1.0
 */
public class ProgChall2
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        char firstInit = firstName.toUpperCase().charAt(0);
        char middleInit = middleName.toUpperCase().charAt(0);
        char lastInit = lastName.toUpperCase().charAt(0);
        
        System.out.println();
        System.out.println("My name is: " + firstName + " " + 
        middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + "" 
        + middleInit + "" + lastInit);
        
        scanner.close();
    
    }
}