package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_01_Easy;

public class Question_08 {
    public static void main(String[] args) {
        Fan fanOne = new Fan();
        fanOne.setOn();
        fanOne.setSpeed(Fan.FAST);
        fanOne.setRadius(10);
        fanOne.setColor("yellow");
        System.out.println(fanOne.toString());

        Fan fanTwo = new Fan();
        System.out.println(fanTwo.toString());
    }
}

class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color = "blue";

    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        this.on = true;
    }

    public void setOff(){
        this.on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        String stringOn = "Fan is one.\nFan Speed : " + getSpeed() + "\t\t Fan Color : " + getColor() + "\t\t Fan Radius : " + getRadius();
        String stringOff = "Fan is off.\nFan Color : " + getColor() + "\t\t Fan Radius : " + getRadius();
        return isOn() ? stringOn : stringOff;
    }
}
