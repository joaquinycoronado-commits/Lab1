package Lab2;
import java.util.Scanner;

/**
 * This is a program that will test and determine the validity of any 
 * date in mm/dd/yyyy format, with leap years considered.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/18/2025
 * @version v1.0
 * 
 */
public class ValidDate {
    public static void main (String[] args){
        int monthInput;
        int dayInput;
        int yearInput;
        String temp;
        String output;
        boolean isValid;
        boolean isLeapYear;
        
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("/");
        System.out.print("Enter a date in MM/DD/YYYY format: ");
        monthInput = keyboard.nextInt();
        dayInput = keyboard.nextInt();
        temp = keyboard.nextLine().substring(1);
        yearInput = Integer.parseInt(temp); 
        isValid = false;
        
        output = "";
        if (dayInput < 1){
            output = "Error: All calendar months begin with day 1.";
        }
            else if (dayInput > 31){
            output = "Error: No calendar dates past 31!";
        }
            else switch(monthInput){
                case 1:
                case 3: 
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    isValid = true;
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dayInput <= 30){
                    isValid = true;
                }
                    else {
                    output = "Error: This month doesn't have a 31st day...";
                }
                break;
                case 2:
                    isLeapYear = false;
                    if (yearInput % 400 == 0 || (yearInput % 4 == 0 &&! (yearInput % 100 == 0))){
                        isLeapYear = true;
                    }
                    if (isLeapYear){
                        if (dayInput <= 29){
                            isValid = true;
                        }
                        else
                        {
                        output = "Error: There are only 29 days in February during a leap year.";
                    }
                    } 
                    else if (dayInput >= 28){
                    output = "Error: " + yearInput + " is not a leap year, therefore, there are only 28 days in February of that year.";
                    }
                 break;
                 default: output = ("Error: Month input must be between 1 and 12.");
                }
                
    if (isValid == true){
    System.out.println(monthInput + "/" + dayInput + "/" +  yearInput + " is a valid date.");
    }
    else
    {
    System.out.println(monthInput + "/" + dayInput + "/" + yearInput + " is not a valid date. " + output);
    }
    }
    }
