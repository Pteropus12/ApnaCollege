package exercises;

public class TransposeOfMatrix {
    public static void transpose(int matrix[][]){
        int n= matrix.length;
        int m = matrix[0].length;
        int mat2[][] = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                mat2[i][j] = matrix[j][i];
            }
        }
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(mat2[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6}};
        transpose(matrix);
    }
}
