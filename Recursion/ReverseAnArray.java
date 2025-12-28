package Recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        // Example 1
        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Input 1:");
        printArray(s1, 0);
        reverseTwoPointers(s1);
        System.out.println("Two pointers reversed:");
        printArray(s1, 0);
    }

    // Two-pointer method (iterative): O(n) time, O(1) extra space
    public static void reverseTwoPointers(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println();
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
}
