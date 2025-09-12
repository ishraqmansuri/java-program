
import java.util.*;

public class d3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            int c;
            c = b;
            b = a;
            a = c;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
    }
}
