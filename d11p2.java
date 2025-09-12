import java.util.*;

public class d11p2 {// transpose of metrix

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows");
            int row = sc.nextInt();
            System.out.println("Enter the number of colums");
            int cols = sc.nextInt();

            int[][] MetrixArray = new int[row][cols]; // array[3][4]
            // 0 1 2
            // 3 4 5
            // 6 7 8
            // input every point value
            for (int i = 0; i < row; i++) {

                for (int j = 0; j < cols; j++) {

                    System.out.println("Entre the value of array at row = " + i + " and collom = " + j);
                    MetrixArray[i][j] = sc.nextInt();
                }
                System.out.println();

            }

            System.out.println("output full metrix");
            for (int i = 0; i < row; i++) {

                for (int j = 0; j < cols; j++) {

                    System.out.print(MetrixArray[i][j] + " ");

                }
                System.out.println();
            }

            System.out.println("output transposd metrix");
            for (int i = 0; i < cols; i++) {

                for (int j = 0; j < row; j++) {

                    System.out.print(MetrixArray[j][i] + " ");

                }
                System.out.println();
            }

        }

    }
}
