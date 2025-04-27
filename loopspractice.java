import java.util.Scanner;
public class loopspractice {
 
    public static void main (String[] args) {
      /*   int i=0;
        while(i<20)
        {
            i=i+1;
            System.out.println(i);
            i=i+1;
        }
        System.out.println();*/

     /*    int a =5;

        while(a==a){
           
            if( a% 2 == 0 && a < a+1){
            System.out.println(a);
            a++;
            }else{

            System.out.println("odd");
            }
            a++;
            System.out.println();
        }



     int x = 5;
     int y = 5;

     while((x=5) == y){

        System.out.println("hello");
        x++;
        y++;
     }
System.out.println("out of the loops");
*/

   /*  int x = 5;
    int y = 5;
    
    while( x == y){

        System.out.println("hello");
        x++;
        y++;
    }
*/

int n;
Scanner s = new Scanner(System.in);
n = s.nextInt();
int i =1;
int sum =0;

while(i<=n){

    sum = sum + i;
    i++;
}
System.out.println(sum);
     }
    
}
 