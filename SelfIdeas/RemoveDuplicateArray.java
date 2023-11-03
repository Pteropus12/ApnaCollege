import java.util.Arrays;

public class RemoveDuplicateArray {
    public static void removeDuplicate(int arr[]){  //1 2 3 3 1 5 2   OUTPUT :1 2 3 5
        int arr2[] = new int[arr.length];
        arr2[0]=arr[0];
        int index=1;
        for(int i=1 ; i<arr.length ; i++){//i=2  3
            int sum=0;
            for(int j=0 ; j<i ; j++){
                if(arr[i]!=arr[j]){
                    sum+=1;
                }
            }
            if(sum==i){
                arr2[index] = arr[i];
                index++;
            }
        }

        for(int k=0; k<index ; k++) {
            System.out.print(arr2[k]+ " ");
        }
    }

    public static void main(String args[]){
        int numbers[] = {1,2,3,3,1,5,2};
        removeDuplicate(numbers);
    }
}
