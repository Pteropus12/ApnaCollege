import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in numbers :");
        float income = sc.nextFloat();
        if (income<= 500_000){
            System.out.println("Your taxes are :" + (income*0));
        }
        else if (income >500_000 && income <= 1000_000){
            System.out.println("Your taxes are :"+ (income*0.1));
        } else {
            System.out.println("Your taxes are :"+ (income*0.2));
        }
    }
}
