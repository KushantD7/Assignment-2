// Write a program to calculate simple interest.
// Formula: Simple Interest = (Principal * Rate * Time) / 100
// Take Principal, Rate, and Time as inputs from the user.
import java.util.Scanner;
public class Program_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of interest (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}
