package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a, b, and c from the quadratic equation : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation roots = new QuadraticEquation(a, b, c);
        if (roots.getDiscriminant() < 0){
            System.out.println("The equation has no roots.");
        } else if (roots.getDiscriminant() == 0){
            System.out.println("The equation has one root. rootOne : " + roots.getRootOne());
        } else {
            System.out.println("The equation has two roots. rootOne : " + roots.getRootOne() + "\t\t rootTwo : " + roots.getRootTwo());
        }
    }
}

class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRootOne(){
        return getDiscriminant() >= 0 ? (-b + Math.sqrt(getDiscriminant())) / (2 * a) : 0;
    }

    public double getRootTwo(){
        return getDiscriminant() >= 0 ? (-b - Math.sqrt(getDiscriminant())) / (2 * a) : 0;
    }
}
