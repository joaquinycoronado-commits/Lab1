package Lab2;
import java.util.Random;


/**
 * Write a description of class BarChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
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