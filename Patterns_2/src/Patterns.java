public class Patterns {
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for (int i = 1; i <=totRows; i++){
            //inner - columns
            for (int j = 1; j<=totCols; j++){
                //(i,j)
                if (i==1 || i == totRows || j == 1 || j ==totCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void hollow_invertedPyramid(int n){
        //outer loop
        for (int i = 1; i<=n ; i++){
            //inner loop
            for (int j = 1; j<= n ;j++){
                if ((i+j)>=(n+1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }System.out.println();
        }
    }
    public static void invertedPyramid2(int n){
        //outer loop
        for (int i = 1; i<=n ; i++){
            //inner loops
            for (int j = 1; j<= n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //self - tried method
    public static void invertedHalfPyramidWithNumbers(int n){
        //outer loop
        int ex = n;  //taking a copy variable of n so that the original value does not change as we modify inner loop.
        for (int i = 1; i<=n ; i++){ //taking the lines equal to input
            for (int j = 1 ; j<=ex ; j++){  //taking the j value from 1 to ex where ex decreases by one as we go down
                System.out.print(j);
            }
            System.out.println(); //moving to next line
            ex-=1; //to reduce ex by one each line
        }
    }

    public static void invertedHalfPyramidWithNumbers2(int n){
        for (int i = 1; i<= n ; i++){
            for (int j = 1; j<= n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // self-tried
    public static void floydsTriangle1(int n ){
        int count = 1;
        //outer loop
        for (int i = 1; i<= n ;i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    //self-tried + lecture
    public static void zero_one_triangle_1(int n){
        for (int i = 1; i<= n ; i++){
            for (int j = 1; j<=i ; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    //self-tried
    public static void butterfly_1(int n){
        //1st half
        for (int i =1 ; i<= n ; i++){
            //stars  - i
            for (int j = 1; j<=i ; j++ ){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for (int j = 1; j<= 2*(n-i); j++){  //this loop starts right after the first loop is executed . it does not start from the first index.
                System.out.print(" ");
            }
            //stars - i
            for (int j= 1; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i = n; i>0 ; i--){//2nd part is the mirror image of first half. we just want to reverse the order of lines. so we go from n to 1.
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            for (int j = 1 ; j<= 2*(n-i) ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //self-tried
    public static void solid_rhombus(int n){
        for (int i = 1 ; i<=n ;i++){
            for (int j=1; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //self-tried
    public static void hollow_rhombus(int n){
        //outer loop - lines
        for (int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }

            for( int j=1 ; j<=n ; j++){
                if(i==1 || i==n || j==1 || j== n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    //self-tried
    public static void diamond_pattern(int n){
        for (int i=1 ; i<=n ; i++){
            for( int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n ; i>=1 ; i--){
            for( int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }







    public static void main(String args[]){
        //hollow_rectangle(5,4);

        //hollow_invertedPyramid(2);
        //invertedPyramid2(1);
        //invertedHalfPyramidWithNumbers(5);
        //invertedHalfPyramidWithNumbers2(5);
        floydsTriangle1(5);
//        zero_one_triangle_1(5);
//        butterfly_1(5);
//        solid_rhombus(5);
//        hollow_rhombus(5);
//        diamond_pattern(80);
    }
}
