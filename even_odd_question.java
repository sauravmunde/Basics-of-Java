import java.util.Scanner;

public class even_odd_question {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
               
        int a , b;
      System.out.println("first num");
        a= s.nextInt();

        System.out.println("second num");
        b= s.nextInt();

        if( a > b ){
            System.out.println("first num is greater");
        }else{

            System.out.println("second num is greater");
        }
        System.out.println("outside if else");
    }
}
