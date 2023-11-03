public class SumArray_3_KadaneAlgorithm {
    public static int maxSum(int arr[] ){
        int curSum= 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length ; i++){
            curSum+=arr[i];
            if(curSum<0){
                curSum =0;
            }
            maxSum=Math.max(curSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]){
        int numbers[] = {1,-3,5,-3,4,6,-1} ;
        System.out.println(maxSum(numbers));
    }
}
