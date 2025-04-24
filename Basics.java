public class Basics {
    public static void main(String[] args) {

        short s = 1;

        int i = 5;

        long l = 40;

        float f = 1;

        double d = 3;

        boolean b = true;

        System.out.println(i);
        System.out.println(d);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);

        System.out.println();
        i = i * i;
        int j = (int) (i + l + f + d + s);
        System.out.println(j);

    }
}