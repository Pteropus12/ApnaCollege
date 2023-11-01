public class FunctionsDemoCode {
    //create a function to reduce the repeated use hello world.
    public static void printHW(){ // does not take any input so nothing in paranthesis. does not return any value
        System.out.println("Hello World!");// just prints hello world so output type is void.
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return;
    }

    public static void main(String args[]){
        printHW();
    }
}
