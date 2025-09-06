package Unit_02_Object_Oriented_Programming.Chapter_09.Example;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Cir circle1 = new Cir(1);
        Cir circle2 = new Cir(2);

        swap1(circle1, circle2);
        System.out.println("After swap1 : circle1 = " + circle1.radius + " circle2 = " + circle2.radius);

        swap2(circle1, circle2);
        System.out.println("After swap2 : circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
    }

    public static void swap1(Cir x, Cir y){
        Cir temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Cir x, Cir y){
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }

}

class Cir {
    double radius;

    Cir(double newRadius){
        radius = newRadius;
    }
}
