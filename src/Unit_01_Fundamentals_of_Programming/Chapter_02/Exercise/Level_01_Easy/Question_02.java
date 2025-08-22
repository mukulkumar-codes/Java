package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the side and height of an equilateral triangle: ");
        double sideLength = input.nextDouble();

        double area = Math.sqrt(3) / 4 * sideLength * sideLength;
        double volume = area * sideLength;

        System.out.println("The area of the equilateral triangle with the side length " + sideLength + " is " + (int) (area * 100) / 100.0);
        System.out.println("The volume of the equilateral triangular prism with the side length " + sideLength + " is " + (int) (volume * 100) / 100.0);
    }
}
