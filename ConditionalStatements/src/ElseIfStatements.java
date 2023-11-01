import java.util.*;
public class ElseIfStatements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are an adult.");
        }
        else if (age >= 13){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are a child.");
        }
    }

}
