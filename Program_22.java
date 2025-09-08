// Write a program that takes two numbers as input from the user and prints their sum.
import java.util.Scanner;
public class Program_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
        sc.close();
    }
}
