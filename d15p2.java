
public class d15p2 { // bubel short
    public static void main(String[] args) {

        int array[] = { 8, 7, 5, 3, 2, 1 }; // array.length = 6 -1 = 5

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    // swipe
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }else{
                    
                }
            }
            
        }
        for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
    }

}
