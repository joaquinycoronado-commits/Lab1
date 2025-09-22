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
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter meal amount: " + "$");
        double priceValue = keyboard.nextDouble();
        final double taxValue = 0.0675 * priceValue;
        final double tipValue = 0.2 * priceValue;
        double totalCost = taxValue + tipValue + priceValue;
        
        System.out.printf("\nThe tax is: $%,.2f", taxValue);
        System.out.printf("\nThe tip amount is: $%,.2f", tipValue);
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f",
        totalCost);
        
        keyboard.close();
    }
}