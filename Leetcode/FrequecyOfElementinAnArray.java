package Leetcode;

public class FrequecyOfElementinAnArray {

	/*
	 * Frequency of the Most Frequent Element (LeetCode)
	 *
	 * The frequency of an element is the number of times it occurs in an array.
	 *
	 * You are given an integer array nums and an integer k. In one operation, you can choose an index
	 * of nums and increment the element at that index by 1.
	 *
	 * Return the maximum possible frequency of an element after performing at most k operations.
	 *
	 * Example 1:
	 * Input: nums = [1,2,4], k = 5
	 * Output: 3
	 *
	 * Example 2:
	 * Input: nums = [1,4,8,13], k = 5
	 * Output: 2
	 *
	 * Example 3:
	 * Input: nums = [3,9,6], k = 2
	 * Output: 1
	 *
	 * Constraints:
	 * 1 <= nums.length <= 10^5
	 * 1 <= nums[i] <= 10^5
	 * 1 <= k <= 10^5
	 */

	public static int maxFrequency(int[] nums, int k) {
		java.util.Arrays.sort(nums);
		long windowSum = 0;
		int left = 0;
		int best = 1;

		for (int right = 0; right < nums.length; right++) {
			windowSum += nums[right];
			while ((long) nums[right] * (right - left + 1) - windowSum > k) {
				windowSum -= nums[left];
				left++;
			}
			best = Math.max(best, right - left + 1);
		}
		return best;
	}

	public static void main(String[] args) {
		System.out.println(maxFrequency(new int[] {1, 2, 4}, 5));
		System.out.println(maxFrequency(new int[] {1, 4, 8, 13}, 5));
		System.out.println(maxFrequency(new int[] {3, 9, 6}, 2));
	}
}
