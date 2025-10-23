package Lab6;
import java.util.Scanner;


/**
 * This is the driver for the BankAccount class.
 *
 * @Joaquin Coronado joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 10/22/2025
 */
public class BankAccountDemo
{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter 1 to use whole dollars, or 2 to use currency: ");
        int inputmethod = keyboard.nextInt();
        while (inputmethod != 1 && inputmethod != 2){
            System.out.print("Invalid input. Enter 1 to use whole dollars, or 2 to use currency: ");
            inputmethod = keyboard.nextInt();
        }
        if(inputmethod == 1) {
            useWholeDollarMode();
        }
        else useCurrencyMode();
    }
    /**
     * useWholeDollarMode asks the user for the starting balance, the interest, and the number 
     * of months to process. A BankAccount object is created with balance and interest rates as
     * args. A loop runs based on number of months to process. For each month deposits, 
     * withdraws, and interest rate is calculated. After the loop processes, ending balance, 
     * total deposits, total withdraws, and total interest is displayed.
    */
    public static void useWholeDollarMode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int time = keyboard.nextInt();
        System.out.println("===============================");
        BankAccount bankAccount = new BankAccount(balance, intRate);
        for(int i=1;i<=time;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getbalance());
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getdeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getwithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getinterest());
    }
    /** useCurrencyMode asks the user for the starting balance, the interest, and the number of
     * months to process. A BankAccount object is created with balance and interest rates as 
     * args. A loop runs based on number of months to process. For each month deposits, 
     * withdraws, and interest rate is calculated. After the loop processes, ending balance, 
     * total deposits, total withdraws, and total interest is displayed.
     */
    public static void useCurrencyMode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int time = keyboard.nextInt();
        System.out.println("==============================="); 
        BankAccount bankAccount = new BankAccount(balance, intRate); 
        for(int i=1;i<=time;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getbalance());
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getdeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getwithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getinterest());    
    }
}