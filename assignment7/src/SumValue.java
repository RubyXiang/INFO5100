import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumValue {

    private static Object lock = new Object();
    private static volatile int thread = 0;
    static long sum = 0;

    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr) {
        List<SumOfThread> list = new ArrayList<>();
        long finalSum = 0;

        for (int i = 0; i < 4; i++) {
            SumOfThread thread = new SumOfThread(i * arr.length / 4, (i + 1) * arr.length / 4, arr);
            list.add(thread);
            thread.start();
            try {
                list.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finalSum += list.get(i).getSum();
        }

        return finalSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

}
