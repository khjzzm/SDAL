package io.sdal.string.manipulation;


public class Palindrome {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(str.charAt(end))) {
                end++;
            } else {
                if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static boolean isPalindromeReverse(String str){
        String s_filtered = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s_reversed = new StringBuilder(s_filtered).reverse().toString();
        return s_filtered.equals(s_reversed);
    }
}
