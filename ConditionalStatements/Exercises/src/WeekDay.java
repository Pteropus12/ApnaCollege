import java.util.*;
public class WeekDay {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number of week :");
        short day = sc.nextShort();
        System.out.print("This is ");
        switch (day) {
            case 1 :
                System.out.println("Monday");

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Please enter a number between 1 & 7 next time.");
        }
    }
}
