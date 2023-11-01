import java.util.*;
public class PassFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 :");
        int marks = sc.nextInt();
        String status = (marks>=33)? "PASS" : "FAIL" ;
        System.out.println("Your status is :" + status);
    }
}
