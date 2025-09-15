import java.util.*;

public class d22p1 {

    public static void allSeq(String str, int idx, String newStr, HashSet set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;

            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char mainchar = str.charAt(idx);

        allSeq(str, idx + 1, newStr + mainchar, set);

        allSeq(str, idx + 1, newStr, set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        allSeq(str, 0, "", set);
    }
}
