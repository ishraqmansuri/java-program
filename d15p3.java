
public class d15p3 { // selaction short
    public static void main(String[] args) {

        int array[] = { 8, 7, 5, 3, 2, 1 }; // array.length = 6 -1 = 5
        for (int i = 0; i < array.length; i++) {
            int shortest = i;
            for (int j = 1 + i; j < array.length; j++) {
                if (array[shortest] > array[j]) {
                    shortest = j;

                }

            }
            // swipe 
            int temp = array[i];
            array[i]=array[shortest];
            array[shortest]= temp ; 
       
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

}
