package Unit_01_Fundamentals_of_Programming.Chapter_02.Example;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
