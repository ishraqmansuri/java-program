
public class d20p2 {// sorting
    public static boolean a;

    public static void sort(String str, int n) {
        // boolean a ;
        if (n == 0) {
            if (a == true) {
                System.out.println(a);

            }

            return;

        }
        if (str.charAt(n - 1) < str.charAt(n)) {
            a = true;
        } else {
            a = false;
            System.out.println(a);
            return;
        }

        sort(str, n - 1);

    }

    public static void main(String[] args) {
        sort("13245", 4);

    }
}
/*
public class d20p2 {
    public static boolean sort(String str, int n) {
        if (n == 0) {
            return true; // base case
        }

        if (str.charAt(n - 1) > str.charAt(n)) {
            return false; // agar sequence toot gaya
        }

        return sort(str, n - 1); // recursion continue
    }

    public static void main(String[] args) {
        String s = "13245";
        boolean result = sort(s, s.length() - 1);
        System.out.println("Sorted: " + result);
    }
}

*/
