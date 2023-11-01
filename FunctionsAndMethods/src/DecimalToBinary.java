import java.util.*;
public class DecimalToBinary {
    public static void decToBin(int n){
        int i = 0;
        int num = n;
        int decBin = 0;
        while ( n>0){
            int rem = n% 2;
            decBin += rem*(int)(Math.pow(10,i));
            i++;
            n/=2;
        }
        System.out.println("The binary equivalent of "+ num + " is = "+ decBin);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal number :");
        int a = sc.nextInt();
        decToBin(a);
    }
}
