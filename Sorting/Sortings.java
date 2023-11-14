import java.util.*;
public class Sortings {
    public static void bubbleSort(int[] numbers){
        for(int turn=0; turn<numbers.length-1 ; turn++){  //  4 5. 2 3. 1    0 1 2 3
            int swap=0;
            for(int j=0 ; j<numbers.length-1-turn ; j++){ //  0123 012 01
                if(numbers[j]>numbers[j+1]){
                    //swap
                    numbers[j]= numbers[j]+numbers[j+1];
                    numbers[j+1]= numbers[j]-numbers[j+1];
                    numbers[j]= numbers[j]-numbers[j+1];
                    swap++;
                }

            }
            if(swap==0) {
                System.out.println("Array already sorted.");
                return;
            }
        }
    }




    //increasing
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1 ; i++){
            int minPos= i ;
            for(int j=i+1 ; j<arr.length  ; j++){
                if(arr[minPos]>arr[j]){  //for decreasing reverse the sign
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int[] arr){
        for (int i =1 ; i<arr.length-1 ; i++){ // if we sort 4 elements of a 5 elements array, then it will be sorted
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;

        }
    }

    public static void countSort(int[] array){
        int largest = Integer.MIN_VALUE;

        //finding maximum element out of array
        for(int i=0; i<array.length ; i++){
            largest = Math.max(largest,array[i]);
        }
        //array to store frequencies of elements
        int count[] = new int[largest+1];
        for(int i=0 ; i<array.length ; i++){
            count[array[i]]++;
        }

        //storing frequency of numbers in count array
        int j=0;
        for(int i=0; i<count.length ; i++){
            while (count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    public static void arrayPrint(int[] array) {
        for(int i=0; i<array.length ; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int[] numbers = {1,5,6,7,2,4,1,3,5};
        int[] sorted = {5,4,3,2,1};
<<<<<<< HEAD
//        bubbleSort(numbers);
//        arrayPrint(numbers);
//        bubbleSort(sorted);
//        arrayPrint(sorted);
//
//        selectionSort(numbers);
//        arrayPrint(numbers);
//
//        insertionSort(numbers);
//        arrayPrint(numbers);
//
//        Arrays.sort(sorted,Collections.reverseOrder());
//        arrayPrint(sorted);
        countSort(numbers);
        arrayPrint(numbers);
=======
        bubbleSort(numbers);
        arrayPrint(numbers);
        bubbleSort(sorted);
        arrayPrint(sorted);

        selectionSort(numbers);
        arrayPrint(numbers);

        insertionSort(numbers);
        arrayPrint(numbers);

        Arrays.sort(sorted,Collections.reverseOrder());
        arrayPrint(sorted);
>>>>>>> f6b1e9ad17cf639baf038fe4fa6e75abadcd9566
    }
}
