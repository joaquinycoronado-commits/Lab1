package Lab2;
import java.util.Scanner;

/**
 * 
 * This is a demonstration of the scanner tool in which I will be entering an
 * amount of shares and then the price per each share, and, by combining the 
 * product with a (constant) commission flat-rate, will be 
 * calculating the total price paid for stocks per amount and price of shares.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/13/2025
 * @version v1.0
 */
public class ProgChall15
{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of shares purchased: ");
        double shareCount = keyboard.nextDouble();
        System.out.print("Enter price per share: " + "$");
        double sharePrice = keyboard.nextDouble();
        double sharePriceTotal = shareCount*sharePrice;
        final double commissionPrice = 0.02 * sharePriceTotal;
        double TotalCost = commissionPrice+sharePriceTotal;
        
        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f",sharePriceTotal, commissionPrice, TotalCost);
        
        keyboard.close();
    }
}

