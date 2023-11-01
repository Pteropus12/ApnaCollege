import java.util.*;

class UserBill1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of Pen :");
        float p1 = sc.nextFloat();
        System.out.print("\n Enter the price of Pencil :");
        float p2 = sc.nextFloat();
        System.out.print("\n Enter the price of eraser :");
        float p3 = sc.nextFloat();
        float total = p1 + p2 + p3;
        System.out.println("Your total bill is :"+ total);

    }
}
