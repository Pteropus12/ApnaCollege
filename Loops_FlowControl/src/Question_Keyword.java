import java.util.*;
public class Question_Keyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number :");
            int n = sc.nextInt();
            if (n % 10==0){
                System.out.println("please do not enter multiples of 10 .");
                continue;
            }
            System.out.println("number was :" +n);
        } while (true);
    }
}
