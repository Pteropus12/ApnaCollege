public class FeverCheck {
    public static void main(String args[]){
        double temp = 103.5;
        String fever = (temp>100)? "high fever" : "low fever" ;
        System.out.println("You have "+ fever);
    }

}
