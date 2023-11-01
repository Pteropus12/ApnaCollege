public class PrintInvertedStarPattern {
    public static void main(String args[] ){
        int n = 7;
        for ( int line=1; line<=n ; line++) {
            for (int s = 1; s <= n - line + 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
