import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Calculate the sum of num1 and num2
        int sum = num1 + num2;

        // Calculate the difference of num1 and num2
        int difference = num1 - num2;

        // Calculate the product of num1 and num2
        int product = num1 * num2;

        // Calculate the quotient of num1 divided by num2
        int quotient = num1 / num2; // Assume num2 is not zero

        // Print each result on a separate line
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}