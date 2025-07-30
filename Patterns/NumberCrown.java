public class NumberCrown {
    public static void numberCrown(int n) {
        // Write your code here.
         int space=2*n-1;
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //number
             for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            space=space-2;
            System.out.println();
        }
    }
}