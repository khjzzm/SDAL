package io.sdal.sort;

import io.sdal.utility.TimeUtil;


public class BubbleSort {

    public static void bubbleSort(int[] array) {
        TimeUtil.timeMethod(() -> {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        });
    }

}