import java.util.*;

public class d14p2 {// Input an email from the user. You have to create a username from the email by
                    // deleting the part that comes after ‘@’. Display that username to the user.

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your gmail accout: ");
            String input = sc.next();
            StringBuilder sb = new StringBuilder(input);
            sb.delete(sb.length() - 10, sb.length());
            System.out.println("the user name sugation for you");
            System.out.println(sb);

        }

    }
}
