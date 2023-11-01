public class AssignmentOperators {
    public static void main(String args[]){
        int a = 10;
        //a = a+10;
        a +=10;  //this will be executed faster.
        int b = 15;
        b -=5;
        System.out.println(a);
        System.out.println(b);
        b *=5;
        System.out.println(b);

    }
}
