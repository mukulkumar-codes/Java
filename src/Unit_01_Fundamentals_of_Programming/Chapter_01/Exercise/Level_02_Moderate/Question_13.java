package Unit_01_Fundamentals_of_Programming.Chapter_01.Exercise.Level_02_Moderate;

public class Question_13 {
    public static void main(String[] args) {
        System.out.println("There are two equations and cramer's rule to solve them as given bellow: ");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("x = (ed - bf)/(ad -bc)   ||   y = (af - ec)/(ad - bc)");

        System.out.println();

        System.out.println("Actual given equations are : ");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        System.out.println("x = " + (44.5 * 0.55 - 50.2 * 5.9)/(3.4 * 0.55 - 50.2 * 2.1) + "   ||   " +"y = " + (3.4 * 5.9 - 44.5 * 2.1)/(3.4 * 0.55 - 50.2 * 2.1));
    }
}
