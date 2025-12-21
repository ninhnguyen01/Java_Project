import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name and age

        String name = sc.nextLine();

        int age = sc.nextInt();

        // Print the message using the user's name and age
        System.out.println("Hello, I am " + name + "! I am " + age + " years old.");

        sc.close();
    }
}
