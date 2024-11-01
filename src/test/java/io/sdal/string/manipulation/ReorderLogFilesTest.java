package io.sdal.string.manipulation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.sdal.utility.TimeUtil.timeMethod;
import static org.junit.jupiter.api.Assertions.*;

class ReorderLogFilesTest {

    @Test
    void testReorderLogFiles() {

        String[] logs = {
                "log1 9 2 3 1",
                "let1 abc cat",
                "log2 2 4 5",
                "let2 good dog",
                "let3 abc zoo"
        };

        String[] expected = {
                "let1 abc cat",
                "let3 abc zoo",
                "let2 good dog",
                "log1 9 2 3 1",
                "log2 2 4 5"
        };

        String[] sortedLogs = ReorderLogFiles.sortLogs(logs);

        timeMethod(()-> System.out.println("sortedLogs = " + Arrays.toString(sortedLogs)));

        assertArrayEquals(expected, sortedLogs);
    }

    @Test
    void testReorderLogFilesWithSameContents() {

        String[] logs = {
                "let1 abc cat",
                "let3 abc cat",
                "log2 2 4 5",
                "log1 9 2 3 1",
                "let2 abc cat"
        };

        String[] expected = {
                "let1 abc cat",
                "let2 abc cat",
                "let3 abc cat",
                "log2 2 4 5",
                "log1 9 2 3 1"
        };

        String[] sortedLogs = ReorderLogFiles.sortLogs(logs);

        timeMethod(()-> System.out.println("sortedLogs = " + Arrays.toString(sortedLogs)));

        assertArrayEquals(expected, sortedLogs);
    }

    @Test
    void testReorderLogFilesWithAllDigitLogs() {

        String[] logs = {
                "log1 9 2 3 1",
                "log2 2 4 5",
                "log3 6 3 2",
                "log4 7 1 4"
        };

        String[] expected = {
                "log1 9 2 3 1",
                "log2 2 4 5",
                "log3 6 3 2",
                "log4 7 1 4"
        };

        String[] sortedLogs = ReorderLogFiles.sortLogs(logs);

        timeMethod(()-> System.out.println("sortedLogs = " + Arrays.toString(sortedLogs)));

        assertArrayEquals(expected, sortedLogs);
    }
}
