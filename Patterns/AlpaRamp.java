public class AlpaRamp {
    public static void alphaRamp(int n) {
        // Write your code here
        char letter='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(letter+" ");
            }
            letter++;
            System.out.println();
        }
    }
}
