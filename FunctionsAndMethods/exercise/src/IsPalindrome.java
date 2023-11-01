import java.util.*;
public class IsPalindrome {
    public static boolean isPalin(int a){
        int rev = 0;
        int myNum = a;
        while (a > 0){
            int rem = a % 10;
            rev = rev*10 + rem;
            a /= 10;
        }
        if (myNum == rev){
            return true;
        }else {
            return false;
        }


    }
    public static void main(String args[]){
        int num = 2332;
        System.out.println(isPalin(num));
    }
}
