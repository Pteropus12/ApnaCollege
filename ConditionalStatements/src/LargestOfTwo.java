import java.util.*;
public class LargestOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number A:");
        int A = sc.nextInt();
        System.out.println("Enter second number B:");
        int B = sc.nextInt();
        if (A>B){
            System.out.println("A is the greater number.");
        }
        else {
            System.out.println("B is the greater number.");
        }
    }

}
