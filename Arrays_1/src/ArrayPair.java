public class ArrayPair {
    public static void arrayPair(int array[]){
        int n=array.length ;
        int tp = n*(n-1)/2 ;
        for (int i=0 ; i<array.length ;i++){
            for(int j=i+1; j<array.length ; j++){
                System.out.print("(" + array[i] + ","+ array[j] + ") ");
            }
            System.out.println();
        }
        System.out.println("Total pairs are : "+ tp);
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        arrayPair(number);
    }
}
