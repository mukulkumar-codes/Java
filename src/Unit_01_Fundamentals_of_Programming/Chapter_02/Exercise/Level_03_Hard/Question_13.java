package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_03_Hard;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount : ");
        double monthlySavings = input.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        double amountAfterFirstMonth = monthlySavings * (1 + monthlyInterestRate);
        double amountAfterSecondMonth = (amountAfterFirstMonth + monthlySavings) * (1 + monthlyInterestRate);
        double amountAfterThirdMonth = (amountAfterSecondMonth + monthlySavings) * (1 + monthlyInterestRate);
        double amountAfterFourthMonth = (amountAfterThirdMonth + monthlySavings) * (1 + monthlyInterestRate);
        double amountAfterFifthMonth = (amountAfterFourthMonth + monthlySavings) * (1 + monthlyInterestRate);
        double amountAfterSixthMonth = (amountAfterFifthMonth + monthlySavings) * (1 + monthlyInterestRate);

        System.out.println("After the first month, the account value is " + (int) (amountAfterFirstMonth * 10000) / 10000.0);
        System.out.println("After the first month, the account value is " + (int) (amountAfterSecondMonth * 10000) / 10000.0);
        System.out.println("After the first month, the account value is " + (int) (amountAfterThirdMonth * 10000) / 10000.0);
        System.out.println("After the first month, the account value is " + (int) (amountAfterSixthMonth * 10000) / 10000.0);
    }
}
