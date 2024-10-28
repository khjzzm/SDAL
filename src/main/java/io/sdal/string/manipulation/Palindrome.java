package io.sdal.string.manipulation;


public class Palindrome {

    //todo　영,숫자만 판별
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
