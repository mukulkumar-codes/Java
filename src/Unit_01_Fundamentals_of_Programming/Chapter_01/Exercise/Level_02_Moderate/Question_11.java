package Unit_01_Fundamentals_of_Programming.Chapter_01.Exercise.Level_02_Moderate;

public class Question_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312_032_486;
        System.out.println("Population changing parameters are given below :");
        System.out.println("1. One birth every 7 seconds");
        System.out.println("2. One death every 13 seconds");
        System.out.println("3. One new immigrant evey 45 seconds");

        int secondsInAYear = 365 * 24 * 60 * 60;
        int populationGrowthInAYear = secondsInAYear / 7 - secondsInAYear / 13 + secondsInAYear / 45;

        System.out.println("Current population : " + CURRENT_POPULATION);
        int firstYearPopulation = CURRENT_POPULATION + populationGrowthInAYear;
        System.out.println("Population after one year : " + firstYearPopulation);
        int secondYearPopulation = firstYearPopulation + populationGrowthInAYear;
        System.out.println("Population after one year : " + secondYearPopulation);
        int thirdYearPopulation = secondYearPopulation + populationGrowthInAYear;
        System.out.println("Population after one year : " + thirdYearPopulation);
        int fourthYearPopulation = thirdYearPopulation + populationGrowthInAYear;
        System.out.println("Population after one year : " + fourthYearPopulation);
        int fifthYearPopulation = fourthYearPopulation + populationGrowthInAYear;
        System.out.println("Population after one year : " + fifthYearPopulation);
    }
}
