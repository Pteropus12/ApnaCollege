import java.util.*;
public class Exercises {


    public static void bubbleSort(int arr[]){  //3,6,2,1,8,7,4,5,3,1
        int n= arr.length;
        for(int i=0; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1; j++ ){
                if(arr[j]<arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }

    public static void selectionSort(int arr[]){ // 5 4 1 3 2
        for(int i=0 ; i<arr.length-1 ; i++) {
            int minpos =i;
            for (int j = i+1 ; j<arr.length ; j++){
                if( arr[minpos]<arr[j]){
                    minpos = j;
                }
            }
            if(arr[minpos]>arr[i]){
                int temp = arr[i];
                arr[i]= arr[minpos];
                arr[minpos] = temp;
            }
        }

    }

    public static void swap(int a , int b){
        int temp =b;
        b=a;
        a=temp;
    }



    public static void arPrint(int array[]){
        for(int i=0; i<array.length ; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
//        arPrint(array);
//        bubbleSort(array);
//        arPrint(array);
//        bubbleSort(array);
        selectionSort(array);
        arPrint(array);
    }
}

