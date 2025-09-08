// Write a program that takes the distance in kilometers as input from the user
// and converts it into miles using the formula: Miles = Kilometers * 0.621371
import java.util.Scanner;
public class Program_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        // Convert to miles
        double miles = kilometers * 0.621371;
        // Printing result
        System.out.println(kilometers + " kilometers = " + miles + " miles");
        sc.close();
    }
}
