package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the co-ordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double sideOne = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double sideTwo = Math.pow((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3), 0.5);
        double sideThree = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);

        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.pow(s * (s - sideOne) * (s - sideTwo) * (s - sideThree), 0.5);

        System.out.println("The area of the triangle is " + (int) (area * 100 + 0.5) / 100.0);
    }
}
