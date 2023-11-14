package exercises;

public class CountSeven {

    public static int countSeven(int matrix[][]){
        int count=0;

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("the number of times 7 occured is :" + count);
        return count;
    }

    public static void main(String args[]){
        int matrix[][]= {{2,3,7},{1,2,4},{5,7,8}};
        countSeven(matrix);
    }
}
