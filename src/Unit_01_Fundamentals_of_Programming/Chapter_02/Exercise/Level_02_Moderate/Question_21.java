package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        System.out.println("Future value is $" + (int) (futureInvestmentValue * 100 + .5) / 100.0);
    }
}
