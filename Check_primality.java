import java.util.Scanner;
public class Check_primality {

    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int div = 2;
        boolean isPrime = true;

        while(div <= n - 1){

            if(n % div == 0){

               // System.out.println("composite");
           
               isPrime = false;

            }
         
            div = div +1;
        }

        if(isPrime == true){

            System.out.println("prime");
        }else{
            System.out.println("composite");
        }
    }
    
}
