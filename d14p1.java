import java.util.*;

public class d14p1 {// string builder

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            

           StringBuilder sb = new StringBuilder("ishraqmansuri");
           
           for (int i = 0; i <sb.length()/2 ; i++) {
            int frunt = i ;
            int  end = sb.length() -1 - i ;

            char fruntChar = sb.charAt(frunt);
            char endChar = sb.charAt(end);

            sb.setCharAt(frunt, endChar);
            sb.setCharAt(end, fruntChar);
        
            


        }
        System.out.println(sb);

        }

    }
}
