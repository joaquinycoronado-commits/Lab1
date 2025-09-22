package Lab2;
import java.util.Scanner;

/**
 * This is a program that will display three non-negative integers in
 * increasing order.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/18/2025
 * @version v1.0
 * 
 */
public class Sorting {
    public static void main (String[] args){
        int n1;
        int n2;
        int n3;
        int low;
        int med;
        int high;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers for sorting");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        
        if ((n1<=n2) && (n1<=n3)){
            low = n1;
            if (n2<=n3){
                med = n2;
                high = n3;
            }
            else{
                med = n3;
                high = n2;
            }
        }
        else if (n2<=n3){
            low = n2;
            if (n1<=n3){
                med = n1;
                high = n3;
            }
            else{
                med = n3;
                high = n1;
            }
        }
        else{ 
            low = n3;
            if (n1<=n2){
                med = n1;
                high = n2;
            }
            else{
                med = n2;
                high = n1;
            }
        }
        System.out.println("The inputs sorted from smallest to largest are: " + low + ", " + med + ", " + high);
    }
}
            
        
        
        