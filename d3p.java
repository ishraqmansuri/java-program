
import java.util.*;// make a holow rectangle using stare

public class d3p {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter row ");
            int r = sc.nextInt();
            System.out.print("Enter column ");
            int c = sc.nextInt();

            for (int i = 1; i <= c; i++) {

                for (int j = 1; j <= r; j++) {

                   if (i == 1 || i == c || j == 1 || j == r) {

                       System.out.print("*  ");
                   }
                    else{
                        System.out.print("   ");
                    }                }
                System.out.print("\n");

            }

        }
       
    }

}


    // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i*n);
        // }

        // int i = 1;
        // while (i < 11) {
        //     System.out.println(i * n);
        //     // i++;
        //     i = i + 1;
        // }
        // int i = 1; // pehle code chalta he phir condition check hoti he 
        // do {
        //     System.out.println(i * n);
        //     i = i + 1;
        // } while (i < 1);