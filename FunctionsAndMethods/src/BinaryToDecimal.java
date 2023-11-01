import java.util.*;
public class BinaryToDecimal  {

    public static void binDec(int binNum){ //takes binary input
        int myNum = binNum;
        int pow = 0;
        int decNum =0;
        while (binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit* (int)(Math.pow(2,pow)));
            pow++;
            binNum /= 10;
        }

        System.out.print("The equivalent decimal of "+ myNum + " is = "+decNum );
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary you want to conver to decimal :");
        int binNum = sc.nextInt();int myNum = binNum;
        binDec(binNum);



    }
}
