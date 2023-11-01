import java.util.*;

public class ReverseTheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int rev = 0;
        while ( num > 0){
            int ld =num % 10; // ld is last digit here.
            rev = rev*10 + ld ; // this is used to add the next lower digit in the reverse number. for ex : 99800+1=99801
            num/=10;
        }
        System.out.println(rev);
    }
}
