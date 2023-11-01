public class CallByValue {
    public static void swap(int a, int b){  // we created this function to swap the values of two given numbers.
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + ","+ b);

    }

    public static void main(String args[]){
       //swap values
        int a = 5;
        int b = 10;
        System.out.println(a + ","+ b);
        swap(a,b);




    }
}
