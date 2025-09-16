public class d23p1 {
    public static void purm(String str, String newStr) {
        if (str.length() == 0) {
            System.out.println(newStr);
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            // abc
            char newchar = str.charAt(i);
            // bc
            String newStr1 = str.substring(0, i) + str.substring(i + 1, str.length());
            purm(newStr1, newStr + newchar);

        }

    }

    public static void main(String[] args) {
        purm("abc", "");
    }
}
