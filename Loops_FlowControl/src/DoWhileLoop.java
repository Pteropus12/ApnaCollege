import java.util.*;
public class DoWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print HW :");
        int times = sc.nextInt();
        int counter = 1;
        do {
            System.out.println(counter +".Hello World!");
            counter ++;
        } while (counter <= times);

    }
}
