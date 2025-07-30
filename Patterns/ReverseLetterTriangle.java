public class ReverseLetterTriangle {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=n;i>=0;i--){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
