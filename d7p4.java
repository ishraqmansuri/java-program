import java.util.*;//add two numbet using function

public class d7p4 {

    public static int fectorial(int n) {
       for(int i = 1 ; i <=n ; i++ ){
        int c = 1;
        c = c * i;
           System.out.println();
       }

        return c;


    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a :");
            int n = sc.nextInt();
            

            int f= fectorial(n);// function call 
            System.out.println("Factorial of the number is:" + f);
        }

    }

}

