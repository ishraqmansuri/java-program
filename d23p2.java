public class d23p2 {
    public static int fintrot(int i, int j, int m, int n) {
       if (i == m || j == n ) {
                return 0;
                    
       }
        if (i == m-1 && j == n -1 ) {
                return 1;
                    
       }

         int rightTraking = fintrot(i, j+1, m, n);
         int downeTraking = fintrot(i+1, j, m, n);

         return rightTraking + downeTraking ;

    }

    public static void main(String[] args) {
     int m = 3;
     int n = 3;
     int a = fintrot(0, 0, m, n);
     System.out.println(a);
    }
}
