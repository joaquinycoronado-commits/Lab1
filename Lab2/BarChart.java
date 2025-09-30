package Lab2;
import java.util.Random;


/**
 * This program will generate three random numbers and then an amount
 * of stars equal to each number divided by 100, excluding the remainder.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/28/2025
 * @version v1.0
 */
public class BarChart
{
    public static void main(String[] args){
        int first = (int)(Math.random()*1000);
        int second = (int)(Math.random()*1000);
        int third = (int)(Math.random()*1000);
        
        System.out.println("The first number is: " + first);
        System.out.println("The second number is: " + second);
        System.out.println("The third number is: " + third);
        System.out.println("");
        System.out.println("NUMBER BAR CHART:");
        System.out.println("");
        System.out.print("Number 1: ");
        if(first>=100)
            for(int i=1;i<=first/100;i++){
            System.out.print("*");
        }
        else 
        System.out.print("<100 no stars");
        System.out.println("");
        System.out.print("Number 2: ");
        if(second>=100)
            for(int i=1;i<=second/100;i++){
            System.out.print("*");
        }
        else 
        System.out.print("<100 no stars");
        System.out.println("");
        System.out.print("Number 3: ");
        if(third>=100)
            for(int i=1;i<=third/100;i++){
            System.out.print("*");
        }
        else 
        System.out.print("<100 no stars");
        System.out.println("");
    }
}