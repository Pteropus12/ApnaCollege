public class FunctionOverloadUsingDatatypes {
    // function to add two integers
    public static int sum(int a, int b){
        return a+b;
    }

    //function to add two float values
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println(sum(4,3));
        System.out.println(sum(2.5f,2.5f));
    }
}
