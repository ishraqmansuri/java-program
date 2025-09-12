public class d19p1 { // tower of hanoi
    public static void hunu(int n, String Start, String Help, String End) {
        if (n == 0) {
            return;
        }

        hunu(n - 1, Start, End, Help);

        System.out.println("trasfer " + n + " from " + Start + " to " + End);

        hunu(n - 1, Help, Start, End);

    }

    public static void main(String[] args) {

        int n = 4; // totel number
        // Start Help End
        hunu(n, "Start", "Help", "End");
    }

}