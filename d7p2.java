
import java.util.*;

public class d7p2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            int c = n;

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= c - i; j++) {
                    System.out.print("   ");
                }
                int d = 2 * i - 1;
                for (int j = 1; j <= d; j++) {
                    System.out.print("*  ");
                }
                System.out.println();

            }
            for (int i = n; i >= 1; i--) {

                for (int j = 1; j <= c - i; j++) {
                    System.out.print("   ");
                }
                int d = 2 * i - 1;
                for (int j = 1; j <= d; j++) {
                    System.out.print("*  ");
                }
                System.out.println();

            }


        }
    }
}
