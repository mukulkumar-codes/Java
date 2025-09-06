package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_02_Moderate;

import java.util.Random;

public class Question_06 {
    public static void main(String[] args) {
        int[] arr = new int[100_000];
        Random number = new Random();
        for (int i = 0; i < 100_000; i++) {
            arr[i] = number.nextInt(1000);
        }

        Stopwatch timer = new Stopwatch();
        selectionSort(arr);
        timer.stop();

        System.out.println("Total time is sorting : " + timer.getElapsedTime() / 1000.0 + " seconds.");
    }


    public static void selectionSort(int[] array){
        int size = array.length;

        for (int i = size - 1; i > 0; i--) {
            int largest = array[i];
            for (int j = i - 1; j > -1; j--) {
                if (array[j] > largest){
                    int temp = largest;
                    largest = array[j];
                    array[j] = temp;
                }
            }
            array[i] = largest;
        }
    }
}

class Stopwatch {
    private long startTime;
    private long endTime;

    Stopwatch(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
