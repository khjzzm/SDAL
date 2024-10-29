package io.sdal.string.manipulation;

import org.junit.jupiter.api.Test;

import static io.sdal.string.manipulation.Palindrome.isPalindrome;
import static io.sdal.string.manipulation.Palindrome.isPalindromeReverse;
import static io.sdal.utility.TimeUtil.timeMethod;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PalindromeTest {

    @Test
    void isPalindromeTest() {
//        assertTrue(isPalindrome("mADaM"));
//        assertTrue(isPalindrome("madam"));
//        assertFalse(isPalindrome("madamimada"));
//        assertTrue(isPalindromeReverse( "madam"));
//        assertTrue(isPalindromeReverse( "a가bc나cb가a"));

        String testStr = "abcdefgfedcba";

        // Measurement for isPalindrome method
        timeMethod(() -> System.out.println(isPalindrome(testStr)));

        // Measurement for isPalindromeReverse method
        timeMethod(() -> System.out.println(isPalindromeReverse(testStr)));
    }


}
