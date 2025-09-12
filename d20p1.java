public class d20p1 {
    public static int frist = -1;
    public static int last = -1;

    public static void find(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("frist = " + frist);
            System.out.println("last = " + last);
            return;

        }
        char cher = str.charAt(idx);
        if (cher == element) {

            if (frist == -1) {
                frist = idx;

            } else {
                last = idx;
            }

        }
        find(str, idx + 1, element);

    }

    public static void main(String[] args) {
        find("aashivad", 0, 'a');
        // aashivaad
        // 012345678
    }

}
