package Leetcode;

public class PalindromeOrNot {

	/*
	 * Valid Palindrome (LeetCode)
	 *
	 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
	 * and removing all non-alphanumeric characters, it reads the same forward and backward.
	 * Alphanumeric characters include letters and numbers.
	 *
	 * Given a string s, return true if it is a palindrome, or false otherwise.
	 *
	 * Example 1:
	 * Input:  s = "A man, a plan, a canal: Panama"
	 * Output: true
	 *
	 * Example 2:
	 * Input:  s = "race a car"
	 * Output: false
	 *
	 * Example 3:
	 * Input:  s = " "
	 * Output: true
	 *
	 * Constraints:
	 * 1 <= s.length <= 2 * 10^5
	 * s consists only of printable ASCII characters.
	 */

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			char c1 = Character.toLowerCase(s.charAt(left));
			char c2 = Character.toLowerCase(s.charAt(right));
			if (c1 != c2) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome(" "));
	}
}
