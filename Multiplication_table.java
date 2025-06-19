import java.util.Scanner;

public class Multiplication_table {

    public static void main(String[] args) {https://github.com/sauravmunde/Basics-of-Java/blob/main/Multiplication_table.java

        /*
         * Problem statement
         * Write a program that generates a multiplication table for a given integer.
         * 
         * Detailed explanation ( Input/output format, Notes, Images )
         * Input Format :
         * A single integer, n, where 0 <= n <= 10,000.
         * Output Format :
         * The first 10 multiples of n, each printed on a new line.
         * Constraints :
         * The input integer n is non-negative and less than or equal to 10,000.
         * 
         * 
         * Note:
         * The program should take an integer as input and print the first 10 multiples
         * of the input integer. Each multiple should be printed on a new line. The
         * program should not print anything else. The program should handle the case
         * where the input integer is 0. In this case, the program should print ten
         * lines of 0. The program does not need to handle invalid input. It can assume
         * that the input will always be a valid integer within the specified
         * constraints.
         * Sample Input 1 :
         * 2
         * Sample Output 1 :
         * 2
         * 4
         * 6
         * 8
         * 10
         * 12
         * 14
         * 16
         * 18
         * 20
         * Sample Input 2 :
         * 5
         * Sample Output 2 :
         * 5
         * 10
         * 15
         * 20
         * 25
         * 30
         * 35
         * 40
         * 45
         * 50
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;

        while (i <= 10) {

<<<<<<< HEAD
           
            System.out.println(n*i);
=======
            // n = n * i;
            System.out.println(n * i);
>>>>>>> b4d4163 (si code)
            i++;
        }

    }

}