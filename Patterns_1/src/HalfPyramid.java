import java.util.*;
public class HalfPyramid {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines you want to print :");
    int n =sc.nextInt();
        for (int line = 1 ; line<=n ; line++){
            for (int s=1 ; s<=line ; s++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
