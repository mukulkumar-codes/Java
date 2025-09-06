package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate;

import java.util.GregorianCalendar;

public class Question_05 {
    public static void main(String[] args) {
        GregorianCalendar currentDate = new GregorianCalendar();
        System.out.println("current year : " + currentDate.get(GregorianCalendar.YEAR) + "\t\t current month : " + currentDate.get(GregorianCalendar.MONTH) + "\t\tcurrent day : " + currentDate.get(GregorianCalendar.DAY_OF_MONTH));

        currentDate.setTimeInMillis(1234567898765L);
        System.out.println("current year : " + currentDate.get(GregorianCalendar.YEAR) + "\t\t current month : " + currentDate.get(GregorianCalendar.MONTH) + "\t\tcurrent day : " + currentDate.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
