import java.util.*;
public class IfElseStatements {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();
        if (age>=18){
            System.out.println("You are an adult.");

        }
        else if (age<18 && age>=16) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are neither an adult nor a teenager.");
        }
    }

}
