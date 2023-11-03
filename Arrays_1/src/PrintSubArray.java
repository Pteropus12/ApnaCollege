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
        int ts = 0; //subarray counter
        int n = array.length;  //for specifying
        int sumarray[] = new int[n*(n+1)/2];
        for (int i=0 ; i<array.length; i++){  //defines the starting value of subarray

            for(int j=i ; j<array.length ; j++){  //defines the ending value of subarray

                int sum=0;
                for (int k=i ; k<=j ; k++){
                    System.out.print(array[k]+ " ");// prints the elements of the subarray one by one.
                    sum+=array[k];
                }

                System.out.print(" sum :"+ sum + "    ");
                sumarray[ts]= sum;
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + ts);

        for (int k=0 ; k<sumarray.length ; k++){
            System.out.print(sumarray[k]+" ");
        }

        int largest=Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int l=0; l<sumarray.length-1; l++){
            if (smallest>sumarray[l]){
                smallest=sumarray[l];
            }
            if( largest<sumarray[l]){
                largest=sumarray[l];
            }
        }
        System.out.println("\nThe smallest values out of sums is : " +smallest+ " and the largest value is : "+largest);

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want to input :");
        int n= sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter your elements one by one :");
        for (int i=0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }
        printSubarray2(array);
    }

}
