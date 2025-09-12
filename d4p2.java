
import java.util.*;

public class d4p2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("*  ");

                }
                System.out.println();
            }

        }

    }

}

// int c = n ;
// for (int i = 1; i <= c; i++) {
//     for (int j = 1; j <= n; j++) {
//         System.out.print("*  ");
//     }
//     System.out.println("   ");
//     n = n - 1;
// }

