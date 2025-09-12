
public class d15p4 { // insertion short
    public static void main(String[] args) {

        int array[] = { 8, 7, 5, 3, 2, 1 }; // array.length = 6 -1 = 5
        for (int i = 1; i < array.length; i++) { // 0 vala alrady shorted maan liya
            int kye = array[i]; // agle se kahani shuru ki
            int j = i - 1; // j ko 0 se shuru kar ke i ke sath badate gye
            while (j >= 0 && array[j] > kye) {
                array[j + 1] = array[j]; // aage value badaye ge jese 8 7 6 5 --> 8 7 7 5
                j--;// saath hi loop ke andar ghtate rhe ge

            } // loop se jab bahar aaye ge j = -1 ho chuka hoga

            array[j + 1] = kye; // value shuru me 0 number par print kar dege ex 8 7 7 5 --> 6 7 7 5

        }

        for (int j = 0; j < array.length; j++) { // array ko print kar dege
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

}
