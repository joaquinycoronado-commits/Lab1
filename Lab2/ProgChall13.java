package Lab2;
import java.util.Scanner;

/**
 * 
 * This is a demonstration of the scanner tool in which I will be writing the
 * market price of a meal, then the total amount paid including tips and 
 * taxes.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/13/2025
 * @version v1.0
 */
public class ProgChall13
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        final double taxValue = 1.72;
        final double tipValue = 5.10;
        
        System.out.print("Enter meal amount: " + "$");
        double priceValue = scanner.nextDouble();
        
        System.out.println();
        System.out.println("The tax is: " + "$" + taxValue);
        System.out.println("The tip is: " + "$" + tipValue);
        System.out.println("The meal cost with tax and tip is: " + "$" +
        (taxValue + tipValue + priceValue));
        
        scanner.close();
    }
}