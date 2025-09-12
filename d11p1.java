import java.util.*;

public class d11p1 {// spiral output of the metrix

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows");
            int n = sc.nextInt();
            System.out.println("Enter the number of colums");
            int m = sc.nextInt();

            // n = row m = col
            int[][] MetrixArray = new int[n][m]; // array[3][4]
            // input every point value
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    System.out.println("Entre the value of array at rows = " + i + " and collom = " + j);
                    MetrixArray[i][j] = sc.nextInt();
                }
                System.out.println();

            }

            // output making
            int left = 0;
            int right = m - 1;
            int top = 0;
            int bottom = n - 1;

            while (left <= right && top <= bottom) {

                for (int i = left; i <= right; i++) {
                    System.out.print(MetrixArray[top][i] + " ");

                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    System.out.print(MetrixArray[i][right] + " ");
                }
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(MetrixArray[bottom][i] + " ");
                    }
                    bottom--;

                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(MetrixArray[i][left] + " ");
                    }
                    left++;

                }

            }

        }

    }
}
