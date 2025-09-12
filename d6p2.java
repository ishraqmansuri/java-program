
import java.util.*;

public class d6p2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            int c = n;

            for (int i = 1; i <= c; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("*  ");

                }
                for (int k = n * 2 - 2; k >= 1; k--) {
                    System.out.print("   ");
                }
                n--;
                for (int j = 1; j <= i; j++) {

                    System.out.print("*  ");

                }

                System.out.println();

            }

             for (int i = 1; i <= c; i++) {

                for (int j = c + 1-i; j >= 1; j--) {

                    System.out.print("*  ");

                }
                for (int k = 1; k <= i * 2 - 2; k++) {
                    System.out.print("   ");
                }
                
                for (int j = c + 1-i; j >= 1; j--) {

                    System.out.print("*  ");

                }

                System.out.println();

            }
            

        }

    }

}
