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
    public BankAccount(){
        mintrate = 0.044/12;
        deposit = withdraw = interest = balance = 0;
    }
    public BankAccount(int inBalance, double intRate){
        balance = inBalance;
        mintrate = intRate/1200;
    }
    public BankAccount(double inBalance, double intRate){
        balance = inBalance;
        mintrate = intRate/1200;
    }
    public void makeDeposit(double add){
        balance += add;
        deposit += add;
    }
    public void makeDeposit(int add){
        balance += add;
        deposit += add;
    }
    public void makeWithdraw(double sub){
        balance -= sub;
        withdraw += sub;
    }
    public void makeWithdraw(int sub){
        balance -= sub;
        withdraw += sub;
    }
    public void calcInterest(){
        if (balance>0){
            balance += balance*mintrate;
            interest += balance*mintrate;
        }
    }   
    public double getdeposit(){
        return deposit;
    }
    public double getinterest(){
        return interest;
    }
    public double getwithdraw(){
        return withdraw;
    }
    public double getbalance(){
        return balance;
    }
}
