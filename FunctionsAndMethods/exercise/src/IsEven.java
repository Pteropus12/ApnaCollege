public class IsEven {
    public static boolean isEven(int num){
        if (num%2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String args[]){
        int a = 15;
        System.out.println(isEven(a));
    }
}
