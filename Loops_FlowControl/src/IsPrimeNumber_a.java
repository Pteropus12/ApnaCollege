import java.util.*;
public class IsPrimeNumber_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n == 2 ){
            System.out.println(" 2 is a prime.");
        } else {
            for (int i = 2 ; i<=Math.sqrt(n); i++){
                if ( n % i == 0){
                    isPrime = false;
                    System.out.println("n is not prime.");
                    break;
                }
            }if (isPrime){
                System.out.println("n is prime.");

            }
        }
    }
}
