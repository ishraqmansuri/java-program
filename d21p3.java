public class d21p3 {
    

    public static void allSeq(String str , int idx , String newStr) {
      if (idx == str.length()) {
            System.out.println(newStr);
            return;
      }
      char mainchar = str.charAt(idx);

      allSeq(str, idx+1, newStr+mainchar);

      allSeq(str, idx+1, newStr);
      

    }

    public static void main(String[] args) {
       allSeq("abc",0, "");
    }
}
