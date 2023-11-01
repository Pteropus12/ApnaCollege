import java.util.*;
public class SwitchStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5 :");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("You are a cat.");
                break;
            case 2:
                System.out.println("You may be a cat.");
                break;
            case 3:
                System.out.println("You are not a cat.");
                break;
            case 4:
                System.out.println("you are a dog.");
                break;
            default:
                System.out.println("I don't know if you are a cat or not.");
        }
    }
}
