package io.sdal.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.sdal.sort.BubbleSort.bubbleSort;
import static io.sdal.utility.Generate.generateRandomArray;

class SortTest {

    private int[] ints;
    @BeforeEach
    void setUp() {
        ints = generateRandomArray(100, 1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void bubbleSortTest() {
        System.out.println("arr = " + Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println("arr = " + Arrays.toString(ints));
    }
}