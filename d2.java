
import java.util.Scanner;// calculater using switch

public class d2 {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in); // multipal input le rahe he to  aage try laga ke {} laga do 
        try (Scanner sc = new Scanner(System.in)) { // multipal input le rahe he to  aage try laga ke {} laga do 

            System.out.println("Enter first number:");
            float a = sc.nextFloat();
            System.out.println("Enter second number:");
            float b = sc.nextFloat();
            System.out.println("Enter the operation:");
            String c = sc.next();

            switch (c) { // old switch he to error dega par kaam kare ga  
                // case "+":
                //     System.out.println("Result: " + (a + b));
                //     break;
                case "+" ->
                    System.out.println("Result: " + (a + b));

                // case "-":
                //     System.out.println("Result: " + (a - b));
                //     break;
                // case "*":
                //     System.out.println("Result: " + (a * b));
                //     break;
                // case "/":
                //     System.out.println("Result: " + (a / b));
                //     break;
                // case "%":
                //     System.out.println("result: " + (a % b));
                //     break;
                default ->
                    System.out.println("Error: Invalid operation.");

            }
        }
    }
}
