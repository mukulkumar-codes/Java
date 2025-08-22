package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        double pings = squareMeters * 0.3025;

        System.out.println(squareMeters + " square meters are equivalent to " + (int) (pings * 1000) / 1000.0 + " feet.");

    }
}
