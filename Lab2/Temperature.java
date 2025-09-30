package Lab2;
import java.util.Scanner;


/**
 * This program will (if properly entered) convert a given temperature in Fahrenheit to the corresponding 
 * temperature in Celsius or visa-versa.
 *
 * @Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0
 * @since 9/27/2025
 */
public class Temperature
{
    public static void main (String[] args){
        double inputTemp, output;
        char inputUnit;
        
        Scanner keyboard = new Scanner(System.in);
        
        do {
            do {
            System.out.print("Enter a whole number and a temperature scale (F, f, C, c), separated by a space: ");
            inputTemp = keyboard.nextInt();
            keyboard.reset();
            inputUnit = keyboard.next().toUpperCase().charAt(0);
            if (inputUnit != 'C' && inputUnit != 'F'){
                System.out.print("Invalid scale. Enter C to convert to F or visa-versa: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }
         } while (inputUnit != 'C' && inputUnit != 'F');
        if(inputUnit == 'F'){
            output = (inputTemp - 32) * 5.0 / 9.0;
            System.out.printf("%.0f %c converted is: %.1f C%n", inputTemp, inputUnit, output);
        }
        else {
            output = inputTemp * 9.0 / 5.0 + 32;
            System.out.printf("%.0f %c converted is: %.1f F%n", inputTemp, inputUnit, output);
        }
        System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
        inputUnit = keyboard.next().toUpperCase().charAt(0);
        } while (inputUnit == 'Y');
        }  
    }
