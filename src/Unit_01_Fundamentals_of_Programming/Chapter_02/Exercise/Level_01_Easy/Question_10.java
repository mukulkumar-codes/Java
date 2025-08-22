package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_10  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double waterInKGs = input.nextDouble();

        System.out.print("Enter the initial temperature of water: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature of water: ");
        double finalTemperature = input.nextDouble();

        double energy = waterInKGs * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + (int) (energy * 100) / 100.0);

    }
}
