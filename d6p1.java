
import java.util.*;

public class d6p1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            int c = n;
            for (int s = 1; s <= c; s++) {

                for (int k = n * 2 - 2; k >= 1; k--) {
                    System.out.print("0  ");
                }
                System.out.println();
                n--;
            }
            // int c = n;
            // for (int i = 1; i <= c; i++) {
            //     n--;
            //     for (int j = n; j >= 1; j--) {

            //         System.out.print("   ");
            //     }
            //     for (int k = 1; k <= c; k++) {
            //         System.out.print("*  ");
            //     }
            //     System.out.println();
            // }
        }

    }

}
