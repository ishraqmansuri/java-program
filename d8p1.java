
import java.util.*;// write a program for chack a prime number

public class d8p1 {

    public static void Number(int n) {

        int s = 0;

        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                s = 5;
                break;
            }

        }

        if (s == 5 || n < 0) {
            System.out.println("not prime");

        } else {
            System.out.println("prime number");
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number :");
            int a = sc.nextInt();

            Number(a);

        }

    }

}
