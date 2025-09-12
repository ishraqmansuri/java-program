import java.util.*;

public class d9p3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter how many int you can store in the array");
            int n = sc.nextInt(); // 6
            int[] array = new int[n]; // 0,1,2,3,4,5.
            for (int i = 0; i < n; i++) {
                System.out.println("enter the value for the " + (i + 1) + " integer");
                array[i] = sc.nextInt();

            }
            int max = array[0];
            int maxi = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxi = i;
                }

            }
            int min = array[n-1];
            int mini = 0;
            for (int i = n-1; i >= 0; i--) {
                if (array[i] < min) {
                    min = array[i];
                    mini = i;
                }

            }
            System.out.println("the maximum number of array is : " + max + " at " + (maxi + 1) + " intiger");
            System.out.println("the minimum number of array is : " + min + " at " + (mini + 1) + " intiger");

        }

    }
}
