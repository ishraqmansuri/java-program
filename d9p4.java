import java.util.*;

public class d9p4 {// chacking shorting in assending order

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter how many int you can store in the array :");
            int n = sc.nextInt(); // 6
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("enter the value for the " + (i + 1) + " integer");
                array[i] = sc.nextInt();

            }
            int si = 0;
            System.out.print("given array is :");
            for (int i = 0; i < n - 1; i++) {
                // chack array[i]< array [i+1]
                if (array[i] > array[i + 1]) {
                    si = 100;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(" " + array[i]);
            }

            if (si == 100) {
                System.out.println(" the array is not shorted ");
            } else {
                System.out.println(" the array is shorted");
            }

        }

    }
}