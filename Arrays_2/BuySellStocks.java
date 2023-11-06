public class BuySellStocks {
    //self-tried
    public static int maxProfit(int[] prices){  //  7 1 5 3 6 4   big O n2
        int n = prices.length;
        int maxProfit = 0 ;
        int diff = 0;
        for(int i=1 ; i<n ; i++){ //choose selling price
            for(int j=0 ; j<i ; j++) {  // compare with all previous buying values
                diff = prices[i] - prices[j];
                if(maxProfit<diff){
                    maxProfit = diff;
                }
            }

        }
        return maxProfit;
    }

    //lecture
    public static int maxProfLec(int[] numbers){  // big O n   7 1 0 2 6 4
        int n= numbers.length;
        int bp = Integer.MAX_VALUE; // infinity 7 1 0
        int profit = 0;
        int maxProf = 0;
        for(int i=0; i<n ; i++){
            int sp = numbers[i];
            if(bp<sp){
                profit = sp - bp ;
                maxProf = Math.max(maxProf,profit);
            } else {
                bp = sp;
            }
        }
        return maxProf;
    }



    public static void main(String args[]){
        int prices[] = {4,2,6,3,1,4,9};
        int[] numbers = {8,6,4,2,0};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfLec(prices));
        System.out.println(maxProfit(numbers));
        System.out.println(maxProfLec(numbers));
    }
}
