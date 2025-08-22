package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate : ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100.0);
        System.out.println("The gratuity is $" + (int) (gratuity * 100) / 100.0 + " and total is $" + (int) ((gratuity + subtotal) * 100) / 100.0);
    }
}
