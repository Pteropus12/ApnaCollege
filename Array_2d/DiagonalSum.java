public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){
        if(matrix.length != matrix[0].length){
            return 0 ;  // to satisfy the condition that given matrix is nxn.
        }
        int n= matrix.length;
        int sum1 = 0;
        int sum2 = 0;

            //Primary sum
        for(int i=0 ; i<matrix.length ; i++){
            sum1+=matrix[i][i];
        }
        //Seconday sum
        for(int j=0 ; j<matrix.length ; j++){
            sum2+=matrix[j][matrix.length-1-j];
        }
        if(n%2 !=0){
            int middle= (matrix.length-1)/2;
            sum2-=matrix[middle][middle];
        }
        return sum1+sum2;
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int odd[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSum(odd));
    }
}
