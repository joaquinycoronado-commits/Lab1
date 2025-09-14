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
        Scanner scanner = new Scanner(System.in);
        
        final double commissionPrice = 261.24;
        
        System.out.print("Enter number of shares purchased: ");
        double shareCount = scanner.nextDouble();
        System.out.print("Enter price per share: " + "$");
        double sharePrice = scanner.nextDouble();
        double sharePriceTotal = shareCount*sharePrice;
        
        System.out.println();
        System.out.println("Total cost of shares are: " + "$" + (sharePriceTotal
        ));
        System.out.println("Commission cost is: " + "$" + commissionPrice +
        "\nTotal Cost is: " + "$" + (sharePriceTotal+
        commissionPrice));
        
        scanner.close();
    }
}