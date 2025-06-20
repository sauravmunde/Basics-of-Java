public class Valid_triangle {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int c = 11;
        // Triangle validity check
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is NOT a valid triangle.");
        }
    }
}