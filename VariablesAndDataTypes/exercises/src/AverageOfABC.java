import java.util.*;

public class AverageOfABC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num A :");
        int A = sc.nextInt();
        System.out.println("Enter second num B :");
        int B = sc.nextInt();
        System.out.println("Enter third num C :");
        int C = sc.nextInt();
        int avg =(A + B + C)/3;
        System.out.println("The average of your numbers is :"+ avg);

    }

}
