package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate;

import java.util.Date;

public class Question_03 {
    public static void main(String[] args) {
        Date date = new Date();

        date.setTime(10000);
        System.out.println("Current time is : " + date.toString());

        date.setTime(100000);
        System.out.println("Current time is : " + date.toString());

        date.setTime(1000000);
        System.out.println("Current time is : " + date.toString());

        date.setTime(10000000);
        System.out.println("Current time is : " + date.toString());

        date.setTime(100000000);
        System.out.println("Current time is : " + date.toString());

        date.setTime(1000000000);
        System.out.println("Current time is : " + date.toString());

        date.setTime(100000000000L);
        System.out.println("Current time is : " + date.toString());

        date.setTime(100000000000L);
        System.out.println("Current time is : " + date.toString());

    }
}
