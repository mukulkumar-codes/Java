package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed (meters/second) and acceleration (meters/second^2) : ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double runwayLength = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + (int) (runwayLength * 1000 + 0.5) / 1000.0 + " meters.");
    }
}
