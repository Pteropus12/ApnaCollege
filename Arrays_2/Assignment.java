public class Assignment {

    //question 1
    public static boolean isDuplicate(int[] numbers){
        for(int i= 1; i<numbers.length ; i++){
            for(int j=0 ; j<i ; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] array1 = {1,2,3,1};
        System.out.println(isDuplicate(array1));

    }
}
