package Lab6;
import java.util.Scanner;


/**
 * This is a program that will take the initial balance, the deposited and withdrawn amounts, 
 * and the interest in a bank account over a given period of months and determine the balance
 * at the end of the given period.
 *
 * @author Joaquin Coronado joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 10/22/2025
 */
public class BankAccount
{
    private double deposit;
    private double interest;
    private double mintrate;
    private double withdraw;
    private double balance;
    
    /**
     * Sets the initial values of the deposit, 
     * withdraw, interest, and balance variables, 
     * and a placeholder interest rate value.
     */
    public BankAccount(){
        mintrate = 0.044/12;
        deposit = withdraw = interest = balance = 0;
    }
    /**
     * Records the starting balance and interest 
     * rate input by the user, converting the 
     * interest rate to an annual percentage.
     * @param inBalance (int), intRate.
     */
    public BankAccount(int inBalance, double intRate){
        balance = inBalance;
        mintrate = intRate/1200;
    }
    /**
     * Records the starting balance and interest 
     * rate input by the user, converting the 
     * interest rate to an annual percentage.
     * @param inBalance (double), intRate.
     */
    public BankAccount(double inBalance, double intRate){
        balance = inBalance;
        mintrate = intRate/1200;
    }/**
     * Adds deposited money to the balance.
     * (double)
     * @param add
     */
    public void makeDeposit(double add){
        balance += add;
        deposit += add;
    }
    /**
     * Adds deposited money to the balance.
     * (int)
     * @param add
     */
    public void makeDeposit(int add){
        balance += add;
        deposit += add;
    }
    /**
     * Subtracts withdrawn money from the balance.
     * (double) 
     * @param sub
     */
    public void makeWithdraw(double sub){
        balance -= sub;
        withdraw += sub;
    }
    /**
     * Subtracts withdrawn money from the balance.
     * (int)
     * @param sub
     */
    public void makeWithdraw(int sub){
        balance -= sub;
        withdraw += sub;
    }
    /**
     * Calculates the accumulated interest using 
     * the starting balance and monthly rate.
     */
    public void calcInterest(){
        if (balance>0){
            balance += balance*mintrate;
            interest += balance*mintrate;
        }
    }
    /**
     * Returns the total value deposited from the 
     * account.
     * @return deposit
     */
    public double getdeposit(){
        return deposit;
    }
    /**
     * Returns the interest input from the account.
     * @return interest
     */
    public double getinterest(){
        return interest;
    }
    /**
     * Returns the total value withdrawn from the 
     * account. 
     * @return withdraw
     */
    public double getwithdraw(){
        return withdraw;
    }
    /**
     * Returns the account balance.
     * @return balance
     */
    public double getbalance(){
        return balance;
    }
}
