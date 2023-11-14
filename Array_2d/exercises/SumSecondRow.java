package exercises;

public class SumSecondRow {

    public static int sum2ndRow(int matrix[][]){
        int sum=0;
        for(int i=0 ; i<matrix[1].length ; i++){
            sum+= matrix[1][i];
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][]= {{2,3,7},{1,2,4},{5,7,8}};
        System.out.println(sum2ndRow(matrix));
    }
}
