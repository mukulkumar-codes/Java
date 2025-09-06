package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_03_Hard;

import Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate.LinearEquation;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the points x1, y1, x2, and y2 for equation one : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter the points x3, y3, x4, and y4 for equation two : ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        PointToLine one = new PointToLine(x1, y1, x2, y2);
        PointToLine two = new PointToLine(x3, y3, x4, y4);

        LinearEquation equations = new LinearEquation(one.getXCoefficient(), one.getYCoefficient(), two.getXCoefficient(), two.getYCoefficient(), one.getConstant(), two.getConstant());


        if (equations.isResolvable())
            System.out.println("The Intersecting point is  at : (" + equations.getX() + ", " + equations.getY() + ").");
        else
            System.out.println("The Two lines are parallel.");
    }
}

class PointToLine {
    private double x1, y1, x2, y2;
    private double xCoefficient, yCoefficient, constant;

    PointToLine(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getXCoefficient() {
        return getY1() - getY2();
    }

    public double getYCoefficient() {
        return getX1() - getX2();
    }

    public double getConstant() {
        return (getY1() - getY2()) * getX1() - (getX1() - getX2()) * getY1();
    }
}
