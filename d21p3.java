public class d21p3 {
    

    public static void allseq(String str , int idx , String newStr) {
      if (idx == str.length()) {
            System.out.println(newStr);
            return;
      }
      char mainchar = str.charAt(idx);

      allseq(str, idx+1, newStr+mainchar);

      allseq(str, idx+1, newStr);
      

    }

    public static void main(String[] args) {
       allseq("abc",0, "");
    }
}
