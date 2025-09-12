public class d19p2 {
    public static void reverse(String str, int idx) {
        if (idx == -1) {
            return;
            
        }
        System.out.print(str.charAt(idx)+" ");
        reverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "ishraq";
        int idx = str.length() - 1;
        reverse(str, idx);

    }
}
