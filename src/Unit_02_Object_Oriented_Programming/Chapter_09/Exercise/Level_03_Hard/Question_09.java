package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_03_Hard;

public class Question_09 {
    public static void main(String[] args) {
        RegularPolygon one = new RegularPolygon();
        RegularPolygon two = new RegularPolygon(6, 4);
        RegularPolygon three = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("First regular polygon's perimeter and area are with " + one.getNumberOfSides() + " sides and as " + one.getLengthOfSides() + " length of each side, respectively," + "\nPerimeter : " + one.getPerimeter() + "\t\tArea : " + one.getArea());
        System.out.println("Second regular polygon's perimeter and area are with " + two.getNumberOfSides() + " sides and as " + two.getLengthOfSides() + " length of each side, respectively," + "\nPerimeter : " + two.getPerimeter() + "\t\tArea : " + two.getArea());
        System.out.println("Third regular polygon's perimeter and area are with " + three.getNumberOfSides() + " sides and as " + three.getLengthOfSides() + " length of each side, respectively," + "\nPerimeter : " + three.getPerimeter() + "\t\tArea : " + three.getArea());
    }
}


class RegularPolygon {
    private int numberOfSides;
    private int lengthOfSides;
    private double originX;
    private double originY;

    RegularPolygon(){
        numberOfSides = 3;
        lengthOfSides = 1;
        originX = 0.0;
        originY = 0.0;
    }

    RegularPolygon(int numberOfSides, int lengthOfSides){
        this.numberOfSides = numberOfSides;
        this.lengthOfSides = lengthOfSides;
        this.originX = 0.0;
        this.originY = 0.0;
    }

    RegularPolygon(int numberOfSides, int lengthOfSides, double originX, double originY){
        this.numberOfSides = numberOfSides;
        this.lengthOfSides = lengthOfSides;
        this.originX = 0.0;
        this.originY = 0.0;
    }


    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getLengthOfSides() {
        return lengthOfSides;
    }

    public void setLengthOfSides(int lengthOfSides) {
        this.lengthOfSides = lengthOfSides;
    }

    public double getOriginX() {
        return originX;
    }

    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public double getOriginY() {
        return originY;
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    public double getPerimeter(){
        return numberOfSides * lengthOfSides;
    }

    public double getArea(){
        return numberOfSides * Math.pow(lengthOfSides, 2) / (4 * Math.tan(Math.PI / numberOfSides));
    }
}