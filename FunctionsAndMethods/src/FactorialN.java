import java.util.*;
public class FactorialN {
    public static int factorial(int num){
        int fact = 1;
        for (int i=1 ; i<= num ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        int nfact = factorial(n);
        System.out.println("factorial of the given number is :" + nfact);

    }
}
