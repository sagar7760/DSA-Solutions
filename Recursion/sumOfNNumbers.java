package Recursion;

public class sumOfNNumbers {
    public static void main(String[] args) {
        int n = 5; // Example input
        int sum = sumOfN(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfN(n-1);
    }
}

