package Unit_01_Fundamentals_of_Programming.Chapter_02.Example;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();

        double average = (numberOne + numberTwo + numberThree) / 3;

        System.out.println("The average of " + numberOne + " " + numberTwo + " " + numberThree + " is " + average);

        input.close();
    }
}
