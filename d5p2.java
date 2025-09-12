
import java.util.*;

public class d5p2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n + 1 - i; j++) {

                    System.out.print(j + "  ");

                }

                System.out.println();
            }

        }

    }

}
