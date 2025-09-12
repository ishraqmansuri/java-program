
import java.util.*;

public class d7p1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            int c = n;

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= c - i; j++) {
                    System.out.print("   ");
                    
                }
                if (i == 1 || i == n) {
                    for (int k = 1; k <= n; k++) {
                        System.out.print("*  ");
                    }

                } else {
                    System.out.print("*  ");
                    for (int s = 1; s <= n - 2; s++) {
                        System.out.print("   ");

                    }
                    System.out.print("*  ");

                }

                System.out.println();
            }
            
        }
    }

}
