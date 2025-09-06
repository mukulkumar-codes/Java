package Unit_02_Object_Oriented_Programming.Chapter_09.Example;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        CircleWithStatic circle1 = new CircleWithStatic();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        CircleWithStatic circle2 = new CircleWithStatic(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        CircleWithStatic circle3 = new CircleWithStatic(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        System.out.println();
        CircleWithStatic.getNumberOfObjects();
    }
}

class CircleWithStatic{
    double radius;
    static int numberOfObjects = 0;

    CircleWithStatic(){
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStatic(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    static void getNumberOfObjects(){
        System.out.println("Number of total objects of the class Circle is " + numberOfObjects);
    }
}
