public class IncreasingNumberTriangle {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}