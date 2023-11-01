public class PassingArrayAsArguement {
    public static void update(int array[]){
        for (int i=0 ; i<array.length ; i++){
            array[i] += 1;
        }
        return;
    }


    public static void main(String args[]){
        int marks[] = {94,94,97};
        update(marks);
        for (int i =0 ; i<marks.length ; i++){
            System.out.println(marks[i]);
        }
    }
}
