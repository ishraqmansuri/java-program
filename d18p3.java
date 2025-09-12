public class d18p3 {// n term tak x ki power
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int c = x * power(x,n-1);
        // return c;
         return  x * power(x,n-1);
        

    }

    public static void main(String[] args) {
        int x = 2;
     
        int n=7 ;
     int c  = power(x, n);
     System.out.println(c);
    }

}
