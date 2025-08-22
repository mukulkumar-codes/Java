package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        System.out.println("The cost of driving is $" + (int)(distance / milesPerGallon * pricePerGallon * 100 + 0.5) / 100.0);

    }
}
