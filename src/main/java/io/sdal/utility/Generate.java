package io.sdal.utility;

import java.util.Random;

public class Generate {
    public static int[] generateRandomArray(int size, int bound) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(bound);
        }
        return arr;
    }
}