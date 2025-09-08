// Take a number and print factorial using do-while loop.
import java.util.Scanner;
public class Program_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        long fact = 1; 
        do {
            fact *= i;
            i++;
        } while (i <= num);
        System.out.println("Factorial of " + num + " = " + fact);
        sc.close();
    }
}
