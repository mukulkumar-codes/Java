package Unit_01_Fundamentals_of_Programming.Chapter_02.Exercise.Level_01_Easy;

public class Question_18 {
    public static void main(String[] args) {
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double midX, midY;

        midX = (x1 + x2) / 2;
        midY = (y1 + y2) / 2;

        System.out.println("\ta \t\t\t\t b \t\t\t Middle Point");
        x1 = 0;
        y1 = 0;
        x2 = 2;
        y2 = 1;
        midX = (x1 + x2) / 2;
        midY = (y1 + y2) / 2;
        System.out.println("(" + (int) x1 + ", " + (int) y1 + ")" + "\t\t(" + (int) x2 + ", " + (int) y2 + ")" + "\t\t\t(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");

        x1 = 1;
        y1 = 4;
        x2 = 4;
        y2 = 2;
        midX = (x1 + x2) / 2;
        midY = (y1 + y2) / 2;
        System.out.println("(" + (int) x1 + ", " + (int) y1 + ")" + "\t\t(" + (int) x2 + ", " + (int) y2 + ")" + "\t\t\t(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");

        x1 = 2;
        y1 = 7;
        x2 = 6;
        y2 = 3;
        midX = (x1 + x2) / 2;
        midY = (y1 + y2) / 2;
        System.out.println("(" + (int) x1 + ", " + (int) y1 + ")" + "\t\t(" + (int) x2 + ", " + (int) y2 + ")" + "\t\t\t(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");

        x1 = 3;
        y1 = 9;
        x2 = 10;
        y2 = 5;
        midX = (x1 + x2) / 2;
        midY = (y1 + y2) / 2;
        System.out.println("(" + (int) x1 + ", " + (int) y1 + ")" + "\t\t(" + (int) x2 + ", " + (int) y2 + ")" + "\t\t\t(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");

        x1 = 4;
        y1 = 11;
        x2 = 12;
        y2 = 7;
        midX = (x1 + x2) / 2;
        midY = (y1 + y2) / 2;
        System.out.println("(" + (int) x1 + ", " + (int) y1 + ")" + "\t\t(" + (int) x2 + ", " + (int) y2 + ")" + "\t\t\t(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
    }
}
