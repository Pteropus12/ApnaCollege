import java.util.*;

public class AreaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square :");
        float a = sc.nextFloat();
        float area =(float) a*a;
        System.out.println("The area of your square is :" +area);
    }
}
