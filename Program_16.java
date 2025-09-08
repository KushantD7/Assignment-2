// Print numbers from 1 to 10, but stop at 7 using break.
public class Program_16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // stop the loop when i = 7
            }
            System.out.println(i);
        }
    }
}
