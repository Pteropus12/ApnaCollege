import java.util.*;

public class SumArray_2_PrefixSum {
    public static void printSubarray2(int numbers[]) {

        //for specifying
        int maxSum = Integer.MIN_VALUE; //to hold the value of sum with maximum sum
        //to hold the value of sum with minimum sum
        int currSum =0;

        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1; i< numbers.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for (int i = 0; i < numbers.length; i++) {  //defines the starting value of subarray
            int start = i;
            for (int j = i; j < numbers.length; j++) {  //defines the ending value of subarray
                int end= j;
                currSum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                if (maxSum < currSum) {
                    maxSum = currSum; //max_sum changes its value to maximum possible value from all values
                }

            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " );
        System.out.println("\nThe smallest values out of sums is :  and the largest value is : " + maxSum);

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want to input :");
        int n = sc.nextInt();
        int array2[] = new int[n];
        System.out.println("Enter your elements one by one :");
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }
        printSubarray2(array2);
    }

}