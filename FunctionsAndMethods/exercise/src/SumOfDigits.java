public class SumOfDigits {
    public static int sumDig(int a){
        int sum = 0;
        while (a>0){
            int lastDigit = a% 10;
            sum +=lastDigit;
            a/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        int num = 343;
        System.out.println(sumDig(num));
    }
}
