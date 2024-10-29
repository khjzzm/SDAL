package io.sdal.string.manipulation;

import static io.sdal.utility.TimeUtil.timeMethod;

public class Reverse {

    public static void reverse(char[] str) {

        timeMethod(()-> {
            int start = 0;
            int end = str.length - 1;
            while (start < end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        });
    }
}
