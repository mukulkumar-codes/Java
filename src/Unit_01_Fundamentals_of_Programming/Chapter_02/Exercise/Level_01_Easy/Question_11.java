package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312_032_486;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int secondsInYears = 365 * 24 * 60 * 60 * years;
        int populationGrowthInYears = secondsInYears / 7 - secondsInYears / 13 + secondsInYears / 45;

        System.out.println("The population in " + years + " years is : " + (CURRENT_POPULATION + populationGrowthInYears));
    }
}
