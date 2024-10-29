package io.sdal.string.manipulation;

import org.junit.jupiter.api.Test;

import static io.sdal.string.manipulation.Reverse.reverse;

class ReverseTest {

    @Test
    void reverseTest() {
        char[] abc = new char[]{'a', 'b', 'c'};
        reverse(abc);
    }

}
