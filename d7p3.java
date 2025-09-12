
import java.util.*;//functions

public class d7p3 {

    public static void Fectorial(int name) {
        System.out.println(name);
        int c = 1;
        for (int i = name; i >= 1; i--) {
            c = c * i;
        }
        System.out.println("Factorial of " + name + " is: " + c);

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number ");
            int a = sc.nextInt();
            Fectorial(a);// function call
        }

    }

}
