package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();

        double feet = meters * 3.2786;

        System.out.println(meters + " meters are equivalent to " + (int) (feet * 1000) / 1000.0 + " feet.");

    }
}
