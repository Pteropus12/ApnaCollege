import java.util.*;
public class WhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What line do you want to print :");
        String line = sc.nextLine();
        System.out.println("How much lines do you want to print ? ");
        int times = sc.nextInt();
        int i=0;
        while (i<times){
            System.out.println((i+1)+"." +line);
            i++;
        }
        System.out.println("Printed your given line " +times + " time.");
    }

}
