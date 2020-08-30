package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Randomize {

    public static void main(String[] args) {
        int[] data = new int[5];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(data));
    }
}
