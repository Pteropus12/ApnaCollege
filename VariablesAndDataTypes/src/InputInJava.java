import java.util.*;
public class InputInJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        System.out.println(first);
        String second = sc.nextLine();
        System.out.println("Enter second number : "+second);
        int number = sc.nextInt();
        System.out.println(number);

        float deciNum = sc.nextFloat();
        System.out.println(deciNum);
    }
}
