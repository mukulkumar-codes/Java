package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate;

import java.util.Random;

public class Question_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for(int i = 0; i < 50; i++){
            System.out.print(random.nextInt(100) + " ");
        }
    }
}
