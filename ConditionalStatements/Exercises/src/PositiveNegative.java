import java.util.*;
public class PositiveNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to test :");
        int number = sc.nextInt();
        String posneg = (number>=0)? "positive" : "negative" ;
        System.out.println("The number you entered is :" + posneg);
    }
}
