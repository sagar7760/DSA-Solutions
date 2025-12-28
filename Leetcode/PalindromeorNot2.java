package Leetcode;

public class PalindromeorNot2 {

    /*
     * Valid Palindrome II (LeetCode)
     *
     * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
     *
     * Example 1:
     * Input: s = "aba"
     * Output: true
     *
     * Example 2:
     * Input: s = "abca"
     * Output: true
     * Explanation: You could delete the character 'c'.
     *
     * Example 3:
     * Input: s = "abc"
     * Output: false
     *
     * Constraints:
     * 1 <= s.length <= 10^5
     * s consists of lowercase English letters.
     *
     * Topics: Two Pointers, String, Greedy
     */

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindromeRange(s, left + 1, right) || isPalindromeRange(s, left, right - 1);
            }
        }
        return true;
    }

    private static boolean isPalindromeRange(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
    }
}
