import java.util.*;

public class CreatingArray {
    public static void main(String args[]){
        int marks[] = new int[50];

        int numbers[] = {1 , 2 , 3 }; //3
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();  //physics
        marks[1] = sc.nextInt();  //chemistry
        marks[2] = sc.nextInt();  //maths

        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("maths :" + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3 ;
        System.out.println("percentage :" + percentage + "%" );

        //lenth of array
        System.out.println("lenth of the given array is :"+marks.length);

        //  marks[2] = marks[2] + 1 ;
        //System.out.println("maths :" + marks[2]);






    }

}
