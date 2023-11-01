import java.util.*;
public class BinomialCoefficient {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static float binCoeff(int n, int r){
            int n_fact = factorial(n);
            int r_fact = factorial(r);
            int nmr_fact = factorial(n - r);
            float binCoeff = (float) n_fact / (r_fact * nmr_fact);
            return binCoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n & r :");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("The binomial coefficient of given values is :" + binCoeff(n,r));
    }

}
