import java.util.*;
public class TernaryOperators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter second number :");
        int n2 = sc.nextInt();
        int larger = (n1 > n2)? n1 : n2;
        System.out.println(larger+ " is the larger number.");
    }

}
