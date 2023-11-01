import java.util.*;
public class PrintOneToTen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell till which number you want to print : \n");
        int num = sc.nextInt();
        int i = 1;
        while (i<num+1){
            System.out.print(i+ " ");
            i++;
        }

    }
}
