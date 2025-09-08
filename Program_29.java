// Write a program that takes three numbers as input from the user 
// and prints their average.

import java.util.Scanner;

public class Program_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculating average
        double average = (num1 + num2 + num3) / 3;

        // Printing result
        System.out.println("Average of the three numbers = " + average);

        sc.close();
    }
}
