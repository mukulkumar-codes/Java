package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_01_Easy;

public class Question_01 {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4, 40);
        Rectangle rectangleTwo = new Rectangle(3.5, 35.9);

        System.out.println("Width : " + rectangleOne.width + "\t\t Height : " + rectangleOne.height + "\t\t Area : " + rectangleOne.getArea() + "\t\t Perimeter : " + rectangleOne.getPerimeter());
        System.out.println("Width : " + rectangleTwo.width + "\t\t Height : " + rectangleTwo.height + "\t\t Area : " + rectangleTwo.getArea() + "\t\t Perimeter : " + rectangleTwo.getPerimeter());
    }
}


class Rectangle {
    double height = 1;
    double width = 1;

    Rectangle(){

    }

    Rectangle(double newWidth, double newHeight){
        height = newHeight;
        width = newWidth;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (height + width);
    }
}
