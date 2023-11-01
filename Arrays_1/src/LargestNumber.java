import java.util.*;

public class LargestNumber {

    //self-tried
//    public static int getLargest(int array[]){
//        int largest = Integer.MIN_VALUE;  //-infinity
//        for (int i=0 ;i<(array.length-1) ; i++){
//            if (array[i]<=array[i+1]){
//                largest = array[i+1];
//            } else {
//                largest = array[i];
//            }
//        }
//        return largest;

    public static int getLargest(int array[]){  //this function is more efficient than the above one as it has less loops and conditions
        int largest = Integer.MIN_VALUE;  // - infinity
        for (int i=0 ; i<array.length ; i++){
            if (largest<array[i]){
                largest=array[i];
            }
        }
        return largest;

    }

    //Now we make a similar function to get the smallest value in an array
    public static int getSmallest(int array[]){
        int smallest = Integer.MAX_VALUE;
        for (int i=0 ; i<array.length ; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }





    public static void main(String args[]) {
        int numbers[] = {34, 2, 5, 6, 3};
        System.out.println("largest value in the given array is :" + getLargest(numbers));
        System.out.println("Smallest value in the given array is : " + getSmallest(numbers));
        System.out.println("The index at which ");
    }
}
