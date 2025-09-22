package Lab2;
import java.util.Scanner;

/**
 * This is a program that will calculate the average score between
 * three test scores and determine the grade earned thereof.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/18/2025
 * @version v1.0
 */
public class ProbChall4
{
    public static void main (String[] args){
    int exam1;
    int exam2;
    int exam3;
    double avg;
    char grade;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter three test scores:");
    exam1 = keyboard.nextInt();
    exam2 = keyboard.nextInt();
    exam3 = keyboard.nextInt();
    avg = (exam1+exam2+exam3)/3.0;
    
    if (avg>=90){
        grade = 'A';
    }
    else if (avg>=80){
        grade = 'B';
    }
    else if (avg>=70){
        grade = 'C';
    }
    else if (avg>=60){
        grade = 'D';
    }
    else{
        grade = 'F';
    }
    System.out.printf("Your average score is: %,.1f \nYour grade is: %c",avg, grade);   
    }
}