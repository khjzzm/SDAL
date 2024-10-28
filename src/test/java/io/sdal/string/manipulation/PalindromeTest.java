package io.sdal.string.manipulation;

import org.junit.jupiter.api.Test;

import static io.sdal.string.manipulation.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PalindromeTest {

    @Test
    void isPalindromeTest() {
        assertTrue(isPalindrome("madaM"));
    }
}
