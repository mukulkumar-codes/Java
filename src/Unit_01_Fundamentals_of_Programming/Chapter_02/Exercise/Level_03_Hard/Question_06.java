package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_03_Hard;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int number = input.nextInt();

        int result = 1;
        result *= number % 10;
        result *= (number / 10) % 10;
        result *= (number / 100) % 10;

        System.out.println("The multiplication of all digits in " + number + " is " + result);
    }
}
