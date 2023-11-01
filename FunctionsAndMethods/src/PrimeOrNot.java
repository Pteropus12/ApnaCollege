public class PrimeOrNot {
    //only for a>= 2
    public static boolean isPrime(int a){
        if (a == 2){
            return true;
        }
        if (a == 1){
            return false;
        }

        //boolean isPrime = true;
        for (int i =2 ; i<= a-1 ; i++){
            if (a % i == 0){
                return false;
              //  isPrime = false;
                //break;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPrime(2));
    }
}
