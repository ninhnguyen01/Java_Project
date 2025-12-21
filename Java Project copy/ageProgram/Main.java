package ageProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your name: ");
        name = scanner.next();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.println();

        System.out.printf("Chatbot: Hello %s, nice to meet you!\n", name);
        System.out.println("Chatbot: How old are you?");
        System.out.printf("User: I am %d years old.\n", age);
        System.out.println();
        scanner.close();
    }
}
