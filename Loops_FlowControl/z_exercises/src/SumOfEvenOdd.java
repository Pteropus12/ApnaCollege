import java.util.*;
public class SumOfEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int count = 1;
        do {

            System.out.println("enter the "+count+ "st number");
            int a = sc.nextInt();

            if (a %2 == 0){
                sumEven += a;
            } else {
                sumOdd += a;
            }

            count+=1;
            System.out.println("do you want to add more numbers ?");
            String response = sc.next();


            if (response.equals("yes")){
                continue;
            } else {
                System.out.println("The sum of given even numbers is :" + sumEven);
                System.out.println("The sum of given odd numbers is :" + sumOdd);

                break;
            }
        } while (true);
        sc.close();
    }
}
