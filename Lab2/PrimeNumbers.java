package Lab2;
import java.util.Scanner;

/**
 * This is a program that will determine whether 
 * the number entered by the user is prime or 
 * not.
 *
 * @author (your name)
 * @version v1.0.0
 * @since 10/06/2025
 */
public class PrimeNumbers
{
    public static void main(String[] args){
        boolean prime;
        int num;
        char redotest;
        
        Scanner keyboard = new Scanner(System.in);
        
        do {System.out.print("Enter a whole number to test if prime: ");
            num = keyboard.nextInt();
            prime = testforPrime(num);
            
            if (num < 0)
            System.out.println("Negative numbers are neither prime nor composite (dividing one by a positive number will always result in another negative number)");
            else if (num == 1)
            System.out.println ("One is neither prime nor composite (no factors other than itself). Think about it: can you divide just one person into groups?");
            else if (num == 0)
            System.out.println ("Zero is neither prime nor composite (infinite factors as 0*n and 0/n always equal 0). Think about it: You can't divide zero people into groups; there would be nobody to divide...");
            else if(prime == true)
            System.out.println ("The number you entered is prime");
            else
            System.out.println ("The number you entered is not prime");
            
            System.out.println ("Would you like to test another number for primalcy? (Yes/No)");
            redotest = keyboard.next().toUpperCase().charAt(0);
            
        } while(redotest == 'Y');
        
        System.out.println ("Goodbye!");
        keyboard.close();
    
    }
     /**
     * This method will calculate a number to 
     * determine whether it is prime or not.
     * @param num The number entered by the user.
     * @return prime Whether the entered number is prime or not.
     * 
     */
    public static boolean testforPrime(int num){
        int inNumberSqRt;
        boolean isPrimeMeth = true;
        
        inNumberSqRt = (int)Math.sqrt(num);
        for(int i=2;isPrimeMeth&&i<=inNumberSqRt;i++){
        if(num % i == 0)
        isPrimeMeth = false;
        }
        return isPrimeMeth; 
    }
}
