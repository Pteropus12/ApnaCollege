public class ProductOfa_b {
    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }

    public static void main(String args[]){
        int a = 4;
        int b = 10;
        int prod = multiply(a,b);
        System.out.println("a * b = " +prod);
        prod = multiply (10,20);
        System.out.println("a * b = " + prod);
    }

}
