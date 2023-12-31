import java.util.*;
public class Creation {
    public static boolean search(int matrix[][] , int key){
        int n= matrix.length , m = matrix[0].length ;
        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == key){
                    System.out.println("given element matches with "+(i+1)+"th row and "+(j+1)+"th column ");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){

        int matrix[][] = new int[3][3];
        int n =matrix.length , m= matrix[0].length ;

        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 6);

    }
}
