import java.util.*;

public class d10p1 {

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
            System.out.println(" enter the number you want in the array :");
            int number = sc.nextInt();
            boolean found = true;
            for (int i = 0; i < row; i++) {

                for (int j = 0; j < cols; j++) {
                    if (MetrixArray[i][j] == number) {
                        System.out.println("your number " + number + " found at array row " + i + " and colm  " + j);
                        found = false;
                    }
                }

            }
            if (found == true) {
                System.out.println(number + " is not found in the given array chack your number");
            }





            // output full metrix
            // for (int i = 0; i < row; i++) {

            // for (int j = 0; j < cols; j++) {

            // System.out.print(MetrixArray[i][j]+" ");

            // }
            // System.out.println();
            // }








            
            // outpute only one number
            // System.out.println("which value you want type row number and collome number
            // ");
            // int i = sc.nextInt();
            // int j = sc.nextInt();

            // System.out.println("the value of your array is : "+MetrixArray[i][j]);

        }

    }
}
