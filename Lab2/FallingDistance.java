package Lab2;
import java.util.Scanner;


/**
 * This program will determine the distance 
 * fallen over a certain period of time under 
 * standard Earth gravitational force.
 *
 * @version v1.0.0
 * @since 10/06/2025
 */
public class FallingDistance
{
    public static final double xcel = 9.8;
    public static void main(String[] args){
        double distance;
        int numOfSecs, sec;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter how many seconds to compute: ");
        numOfSecs = keyboard.nextInt();
        System.out.println("");
        System.out.println(" Time(s) \t  Distance(m)");
        System.out.println("==============================");
        for(sec = 1; sec<=numOfSecs;sec++){
            distance = 0.5 * xcel * Math.pow(sec,2);
            System.out.printf("   "+sec+"\t\t    "+ "%.1f %n", distance);
        }
        
    }
    
}    