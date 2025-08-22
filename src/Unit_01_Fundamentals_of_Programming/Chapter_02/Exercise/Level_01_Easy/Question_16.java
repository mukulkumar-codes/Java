package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side : ");
        double sideLength = input.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2) * sideLength * sideLength;

        System.out.println("The area of the hexagon is " + (int) (area * 10000 + 0.5) / 10000.0);
    }
}
