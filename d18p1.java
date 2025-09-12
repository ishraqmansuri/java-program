public class d18p1 {// Print factorial of a number n.

    public static int fect(int n) {
        if (n == 0 || n == 1) {
            return 1 ;

        }

        return n * fect(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        int c = fect(n);
        System.out.println(c);
    }
}
