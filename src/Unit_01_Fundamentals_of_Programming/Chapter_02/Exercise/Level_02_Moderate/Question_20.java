package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;
        double interestAmount = balance * monthlyInterestRate;

        System.out.println("The interest is " + (int) (interestAmount * 100000 + .5) / 100000.0);
    }
}
