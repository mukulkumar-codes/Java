package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting velocity(v0) in meters/second: ");
        double startingVelocity = input.nextDouble();

        System.out.print("Enter the ending velocity(v1) in meters/second: ");
        double endingVelocity = input.nextDouble();

        System.out.print("Enter the time span(t) seconds: ");
        double timeInSeconds = input.nextDouble();

        double averageAcceleration = (endingVelocity - startingVelocity) / timeInSeconds;
        System.out.println("The average acceleration is " + (int) (averageAcceleration * 100) / 100.0);
    }
}
