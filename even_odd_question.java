import java.util.Scanner;

public class even_odd_question {

    public static void main(String[] args) {

      


         Scanner s = new Scanner(System.in);
        /*        
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
    
     */

        int a;
        a = s.nextInt();

       if( a % 2 == 0){

        System.out.println(a + " is even ");
       }

       if(a % 2 == 1){

        System.out.println(a + " is odd ");
       }
    

        }
}


