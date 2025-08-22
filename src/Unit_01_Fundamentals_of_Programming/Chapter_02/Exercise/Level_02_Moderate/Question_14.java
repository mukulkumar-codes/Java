package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double KILOGRAMS_IN_ONE_POUND = 0.45359237;
        final double METERS_IN_ONE_INCH = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * KILOGRAMS_IN_ONE_POUND;
        double heightInMeters = heightInInches * METERS_IN_ONE_INCH;
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + (int) (bmi * 10000 + 0.5) / 10000.0);
    }
}
