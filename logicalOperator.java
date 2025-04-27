public class logicalOperator {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 15;

        if((a <= b) && (b >= a) && (a == b) && (b == a)){

            System.out.println("true");
        }
        else if((a > b) || (b >=a)){

            System.out.println("trueone");
        }
        
        
        else{

            System.out.println("false");
        }
    }
}