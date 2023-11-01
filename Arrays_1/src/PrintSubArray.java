import java.util.*;


public class PrintSubArray {

    //self-tried
//    public static void printSubarray(int array[]){
//        for (int i=0 ; i<array.length ; i++){
//            int array2[] = new int[50]; //introduce a new array to contain the subarrays that we have to print
//            array2[i] = array[i] ;
//            int l=0;
//            for (int j=0 ; j<=l ; j++){    // second number
//                array2[l] = array[l];
//                for(int k=i ; k<array2.length ; k++){
//                    System.out.println(array2[k] + " ");
//                }
//                l++;
//            }
//        }
//    }

    //lecture
    public static void printSubarray2(int array[]){
        int ts = 0;

        for (int i=0 ; i<array.length ; i++){  //defines the starting value of subarray

            for(int j=i ; j<array.length ; j++){  //defines the ending value of subarray

                int sum=0;
                for (int k=i ; k<=j ; k++){
                    System.out.print(array[k]+ " ");// prints the elements of the subarray one by one.
                    sum+=array[k];
                }

                System.out.print(" sum :"+ sum + "    ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + ts);
    }


    public static void main(String args[]){
        int array[] = {2,4,6,8,10};
        printSubarray2(array);

    }

}
