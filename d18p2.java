public class d18p2 { // Print the fibonacci sequence till nth term.
    public static void seq(int a, int b, int n) {
        if (n == 0) {
            return;

        }
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        seq(a, b, n - 1);

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 6;
       

        System.out.println(a);
        System.out.println(b);
        seq(a, b, n-2);

    }

}
