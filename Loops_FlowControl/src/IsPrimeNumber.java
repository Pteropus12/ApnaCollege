import java.util.*;
public class IsPrimeNumber {
    public static void main(String args[]) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :");
        int n = sc.nextInt();

        try {
            if (n == 2) {
                System.out.println("n is a prime.");

            }
            else if(n==1) {
                System.out.println("1 is a special number.");
            }else {
                boolean isPrime = true;
                for (int i = 1; i <=Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println("n is prime.");
                } else {
                    System.out.println("n is not prime.");
                }
            }
        } catch( ArithmeticException e){
            System.out.println("this gives an error because dvided by zero.");

        }
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);

    }
}