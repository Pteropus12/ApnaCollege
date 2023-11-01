import java.util.*;
public class ReverseAnArray {
    public static void reverseArray(int array[]){
        int f = 0, l = array.length -1 ;
        while(f<l){
            int temp = array[f];
            array[f]= array[l];
            array[l]= temp;
            f++;
            l--;
        }
        System.out.print("The reversed array is : ");
        for (int i=0; i<array.length ; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int numbers[] = { 2, 4,6,8,10,12,14 };
        reverseArray(numbers);

    }
}
