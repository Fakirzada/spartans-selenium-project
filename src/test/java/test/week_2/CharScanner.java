package test.week_2;

import java.util.Scanner;

public class CharScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 5; // Define the size of the array
        char[] charArray = new char[arraySize];

        // Fill the array with user input
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter a character for element " + i + ": ");
            String input = scanner.nextLine();

            // Validate the input length to ensure it is a single character
            while (input.length() != 1) {
                System.out.print("Invalid input. Please enter exactly one character: ");
                input = scanner.nextLine();
            }

            charArray[i] = input.charAt(0); // Extract the first character
        }

        // Print the array
        System.out.print("The characters in the array are: ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }

        scanner.close();
    }
}
