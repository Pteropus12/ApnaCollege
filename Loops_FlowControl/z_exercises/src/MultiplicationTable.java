import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        System.out.println("The table of your given number is :");
        for (int i = 1; i <=10 ; i++){
            System.out.println(n+"x"+i+ "="+n*i);
        }
    }
}
