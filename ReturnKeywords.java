import java.util.Scanner;
public class ReturnKeywords {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int div = 2;
        boolean isPrime = true;

        while(div < n - 1){

            if( n % div == 0){
                System.out.println("composite");
                return;
            }
            div = div + 1;
        }
          System.out.println("not composite");
        }   
}
