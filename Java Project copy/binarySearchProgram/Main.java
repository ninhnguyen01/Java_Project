package binarySearchProgram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        char key = 'i';

        int startIndex = 0;
        int endIndex = 4;

        int foundIndex = Arrays.binarySearch(vowels, startIndex, endIndex, key);

        System.out.println();
        System.out.println("The vowel 'i' is at Index: " + foundIndex);
        System.out.println();
    }

}