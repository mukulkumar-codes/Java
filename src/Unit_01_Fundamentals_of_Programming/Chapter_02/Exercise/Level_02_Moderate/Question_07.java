package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        int minutes = input.nextInt();

        int numbersOfHours = minutes / 60;
        int numbersOfDays = numbersOfHours / 24;
        int numbersOfYears = numbersOfDays / 365;
        int remainingDays = numbersOfDays % 365;

        System.out.println(minutes + " minutes is approximately " + numbersOfYears + " years and " + remainingDays + " days.");

    }
}
