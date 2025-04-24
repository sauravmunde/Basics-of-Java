public class SwitchStatementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int result;

        if (a > b) {
            result = 1;
        } else if (a == b) {
            result = 2;
        } else {
            result = 3;
        }

        switch (result) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hello sir");
                break;
            case 3:
                System.out.println("hello dear");
                break;
            default:
                System.out.println("default case");
        }
    }
}
