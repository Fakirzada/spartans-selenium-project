package test.week_2;

import java.util.Random;
import java.util.Scanner;

public class Authintication1 {
    public static void main(String[] args) {
        int rows = 2; // Number of rows
        int cols = 1; // Number of columns
        char[][] array = new char[rows][cols];
        char[][] arrayCapital= new char[rows][cols];
        int [][] arrayNumber= new int[rows][cols];
        Random random = new Random();

        // Fill the 2D array with random lowercase letters
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int number=random.nextInt(100);
                array[i][j] = (char) (random.nextInt(26) + 'a');
                arrayCapital[i][j]=(char)  (random.nextInt(26)+'A');
                //arrayNumber[i][j] = random.nextInt(100);
                arrayNumber[i][j]=number;
            }
        }
        // Print the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
                System.out.print(arrayCapital[i][j] + " ");
                System.out.print(arrayNumber[i][j]+" ");
            }
            //System.out.println();
        }

        //Char 2D array  and Int 2D Array covert to String Array purpose using to Comparison id statement

        String[] ArrayToStringChar = new String[6];
        ArrayToStringChar[0] = Character.toString(array[0][0]);
       ArrayToStringChar[1] = Character.toString(arrayCapital[0][0]);
       ArrayToStringChar[2] = Integer.toString(arrayNumber[0][0]);
        ArrayToStringChar[3] = Character.toString(array[1][0]);
       ArrayToStringChar[4] = Character.toString(arrayCapital[1][0]);
       ArrayToStringChar[5] = Integer.toString(arrayNumber[1][0]);
        System.out.println();
      //  for (String print : ArrayToStringChar) {

        var scanner = new Scanner(System.in);
        int arraySize = 6;
        String[] stringArray = new String[arraySize];

        // Prompt the user to enter strings to fill the array
        for (int i = 0; i < arraySize; i++) {
            //System.out.print(" ");
            System.out.print("Enter  for element " + i+1 + ": ");
            stringArray[i] = scanner.nextLine();
        }
        // Iterate over the arrays and compare elements
        boolean messagePrinted = false;
        //Comparison of each index of Array
        for (int i = 0; i < ArrayToStringChar.length; i++) {
            if (ArrayToStringChar[i].equals(stringArray[i]) &&!messagePrinted) {
               System.out.println("Access Granted It");
               messagePrinted=true;
                //System.out.println("Match found at index " + i + ": " + ArrayToStringChar[i]);
            } else if(!messagePrinted) {

                System.out.println("invalid Input Access Not grated");
                //System.out.println("No match at index " + i + ": " + ArrayToStringChar[i] + " != " + stringArray[i]);
                messagePrinted=true;

            }

        }


    }
}
