public class d21p2 {
    public static boolean[] array = new boolean[26];

    public static void chack(String str, int idx, String newstr) {

        if (idx == str.length()) {
            System.out.println(newstr);
            return;

        }

        char mainchar = str.charAt(idx);
        if (array[mainchar - 'a'] == true) {

            chack(str, idx + 1, newstr);

        } else {
            newstr += mainchar;
            array[mainchar - 'a'] = true ;
            chack(str, idx + 1, newstr);
        }

    }

    public static void main(String[] args) {
        chack("isshhraaqqq", 0, "");
    }
}
