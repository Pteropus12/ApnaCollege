import java.util.*;
public class SumOfnNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 1; // just for indexing
        int sum = 0;// variable at which all sums will be added
        System.out.println("Print the number upto which sum to be calculated :");
        int range = sc.nextInt();
        while ( i <= range ) {
            sum+=i;
            i++;
        }
        System.out.println("The sum of numbers is :" + sum);
    }
}
