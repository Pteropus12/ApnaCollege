import java.util.*;
public class TernaryOperatorsTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check :");
        int num = sc.nextInt();
        String check = (num%2==0)?  "even": "odd";
        System.out.println("The number you entered is :" + check);

    }
}
