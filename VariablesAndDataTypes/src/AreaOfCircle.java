import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println("Area of the given circle is :" +area);
    }
}
