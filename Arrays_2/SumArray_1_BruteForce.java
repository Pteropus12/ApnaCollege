//import java.util.*;
//
//public class SumArray_1_BruteForce {
//    public static void printSubarray2(int numbers[]) {
//        int ts = 0; //subarray counter
//        //for specifying
//        int maxSum = Integer.MIN_VALUE; //to hold the value of sum with maximum sum
//        int min_sum = Integer.MAX_VALUE; //to hold the value of sum with minimum sum
//        int currSum =0;
//        int prefix[] = new int[numbers.length];
//        prefix[0]=numbers[0];
//        //calculate prefix array
//        //for(int i=1; i<)
//
//
//        for (int i = 0; i < array.length; i++) {  //defines the starting value of subarray
//            for (int j = i; j < array.length; j++) {  //defines the ending value of subarray
//                int sum = 0;
//                for (int k = i; k <= j; k++) {  //loop used to start from ith value & end at end value
//                    System.out.print(array[k] + " ");// prints the elements of the subarray one by one.
//                    sum += array[k];
//                }
//                System.out.print(" sum :" + sum + "    ");
//                if (min_sum > sum) {
//                    min_sum = sum;//min_sum changes its value to minimum possible value from all values
//                }
//                if (max_sum < sum) {
//                    max_sum = sum; //max_sum changes its value to maximum possible value from all values
//                }
//                ts++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total subarrays are : " + ts);
//        System.out.println("\nThe smallest values out of sums is : " + min_sum + " and the largest value is : " + max_sum);
//
//    }
//
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array you want to input :");
//        int n = sc.nextInt();
//        int array2[] = new int[n];
//        System.out.println("Enter your elements one by one :");
//        for (int i = 0; i < n; i++) {
//            array2[i] = sc.nextInt();
//        }
//        printSubarray2(array2);
//    }
//
//}