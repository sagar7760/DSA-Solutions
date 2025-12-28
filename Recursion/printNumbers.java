package Recursion;
public class printNumbers {
    public static void printNum(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive call
        printNum(n - 1);
        // Print after returning from recursion
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        printNum(n);
    }
}
