package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_01_Easy;

import java.util.Date;

public class Question_07 {
    public static void main(String[] args) {
        Account personOne = new Account(1122, 20_000);
        personOne.setAnnualInterestRate(4.5);
        personOne.withdraw(2500);
        personOne.deposit(3000);

        System.out.println("Current balance in the account is : " + personOne.getBalance());
        System.out.println("Monthly Interest of the account is : " + personOne.getMonthlyInterest());
        System.out.println("Account created on : " + personOne.getDateCreated());

    }
}

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int newID, double newBalance) {
        id = newID;
        balance = newBalance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int newID) {
        id = newID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }


    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }
}
