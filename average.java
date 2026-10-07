import java.util.*;


public class Aaverage {
    public static int average (int a , int b , int c) {
        int average = (a + b + c)/3 ;
        return average ;

    }

public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int result = average(a, b, c);
    System.out.println(result);


}
}
