package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a, b, and e for equation one : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double e = input.nextDouble();
        System.out.print("Enter the value of c, d, and f for equation one : ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equations = new LinearEquation(a, b, c, d, e, f);
        if (equations.isResolvable())
            System.out.println("Value of x : " + equations.getX() + "\t\tValue of y : " + equations.getY());
        else
            System.out.println("The equations has no solution.");
    }
}

