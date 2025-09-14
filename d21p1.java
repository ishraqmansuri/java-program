public class d21p1 { // move All X
    public static void moveAllX(String str, int idx, int count, String NewString) {
        if (idx == str.length()) {
            System.out.print(NewString);
             
            for (int i = 1; i <= count; i++) {
                System.out.print('x');

            }
            return;

        }

        char charecter = str.charAt(idx);
        if (charecter == 'x') {
            count++;
            moveAllX(str, idx + 1, count, NewString);

        } else {
            NewString += charecter;
            moveAllX(str, idx + 1, count, NewString);
        }
    }

    public static void main(String[] args) {
    moveAllX("isxhrxaqxx", 0, 0, "");
    }

}
