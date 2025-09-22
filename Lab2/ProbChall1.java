package Lab2;
import java.util.Scanner;

/**
 * This is a program that will convert any integer from 1-3 into
 * a roman numeral.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/18/2025
 * @version v1.0
 */
public class ProbChall1 { 
    public static void main (String[] args){
        int UserNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a variable between 1-3: ");
        UserNum = keyboard.nextInt();
        
        switch(UserNum){
        case 1:
            System.out.println("1 converted to a Roman Numeral is \"I\"");
        break;
        case 2:
            System.out.println("2 converted to a Roman Numeral is \"II\"");
        break;
        case 3:
            System.out.println("3 converted to a Roman Numeral is \"III\"");
        break;
        default:
            System.out.println(UserNum + " was not a valid number, value must be between 1-3");
        }
    }
}


