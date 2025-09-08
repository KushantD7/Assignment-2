// Take an integer and check whether it is divisible by both 3 and 5 using a ternary operator.
import java.util.Scanner;
public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String result = (num % 3 == 0 && num % 5 == 0) 
                        ? num + " is divisible by both 3 and 5." 
                        : num + " is NOT divisible by both 3 and 5.";
        System.out.println(result);
        sc.close();
    }
}
