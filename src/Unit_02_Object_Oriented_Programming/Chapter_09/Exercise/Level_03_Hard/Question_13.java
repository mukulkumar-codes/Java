package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_03_Hard;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the matrix : ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = new double[row][column];

        System.out.println("Enter the matrix elements : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(matrix);

        System.out.println("The location of the larget element " + location.maxValue +" is  at (" + location.row + ", " + location.column + ").");

    }
}

class Location {
    int row;
    int column;
    double maxValue;

    Location(int row, int column, double maxValve){
        this.row = row;
        this.column = column;
        this.maxValue = maxValve;
    }

    public static Location locateLargest(double[][] matrix){
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = matrix[maxRow][maxColumn];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue < matrix[i][j]){
                    maxRow = i;
                    maxColumn = j;
                    maxValue = matrix[i][j];
                }
            }
        }
        return new Location(maxRow, maxColumn, maxValue);
    }

}
