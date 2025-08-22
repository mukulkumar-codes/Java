package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is " + (int) (windChill * 100000 + 0.5) / 100000.0);
    }
}
