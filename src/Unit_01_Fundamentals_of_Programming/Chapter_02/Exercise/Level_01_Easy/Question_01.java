package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the miles to convert into kilometers: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.6;
        System.out.println(miles + " miles are equivalent to " + (int) (kilometers * 100) / 100.0 + " kilometers.");
    }
}
