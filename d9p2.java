import java.util.*;

public class d9p2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of the student");
            int n = sc.nextInt(); // 6

            String[] array = new String[n]; // 0,1,2,3,4,5.
            for (int i = 0; i < n; i++) {
                System.out.println("enter the name of " + (i + 1) + " student");
                array[i] = sc.next();

            }
            System.out.println("enter the number you to surch name: ");
            int a = sc.nextInt();
            a= a-1;
            System.out.println(array[a]);
        }

    }
}
