package Lab8;
import java.util.Scanner;


/**
 * This will collect input values from a user and use it to 
 * compute the area and total cost of the carpet. It will also
 * print these the unit (per square foot) and total cost of the
 * carpet.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 11/24/2025
 */
public class CarpetCostDemo
{
    public static void main(String[] args){
        Scanner datainput = new Scanner(System.in);
        
        System.out.print("Enter Room Name: ");
        String getName = datainput.nextLine();
        System.out.print("Enter room length: ");
        double getLength = datainput.nextDouble();
        System.out.print("Enter room width: ");
        double getWidth = datainput.nextDouble();
        System.out.print("Enter cost per square foot: ");
        double costsqft = datainput.nextDouble();
        String close = datainput.nextLine();
        
        RoomSize rs = new RoomSize(getName, getLength, getWidth);
        CarpetCost cost = new CarpetCost(rs, costsqft);
        
        System.out.println(rs.toString());
        System.out.println(cost.toString());
    }
}
