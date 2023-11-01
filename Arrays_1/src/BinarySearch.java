import java.util.*;
public class BinarySearch {
    public static int binarySearch(int array[], int key){
        int start = 0, end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            //comparisons
            if(array[mid] == key){ // found
                return mid;
            } else if(array[mid] < key) { // right
                start = mid+1;
            } else { //left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("the index at which key is present is : "+ binarySearch(numbers , key));
    }
}
