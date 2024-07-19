package test.week_2;

import java.util.Random;
import java.util.Scanner;
public class AuthenticationWithStringArray {
    public static void main(String[] args) {
            int rows = 2; // Number of rows
            int cols = 1; // Number of columns
            String[][] array = new String[rows][cols];
            String[][] arrayCapital= new String[rows][cols];
            int [][] arrayNumber= new int[rows][cols];
            Random random = new Random();
        String[] possibleValues = {"a", "b", "c", "d", "e","x","q"};
        String[] possibleValuesUper = {"A", "B", "C", "D", "E","Q","X"};

        // Fill the 2D array with random lowercase letters
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int randomIndex = random.nextInt(possibleValues.length);
                    int randomIndex1 = random.nextInt(possibleValuesUper.length);
                    int number=random.nextInt(100-1)+1;
                    array[i][j] = possibleValues[randomIndex];
                    arrayCapital[i][j] = possibleValuesUper[randomIndex1];
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
            }
            //Char 2D array  and Int 2D Array covert to String Array purpose using to Comparison id statement
            String[] ArrayToString = new String[6];
            ArrayToString[0] = array[0][0];
            ArrayToString[1] = arrayCapital[0][0];
            ArrayToString[2] = Integer.toString(arrayNumber[0][0]);
            ArrayToString[3] = array[1][0];
            ArrayToString[4] = arrayCapital[1][0];
            ArrayToString[5] = Integer.toString(arrayNumber[1][0]);
           System.out.println();

            var scanner = new Scanner(System.in);
            int arraySize = 6;
            String[] stringArray = new String[arraySize];

            // Prompt the user to enter strings to fill the array
            for (int i = 0; i < arraySize; i++) {
                //System.out.print(" ");
                System.out.print("Enter Match value " + i + ": ");
                stringArray[i] = scanner.next();
            }

            //Comparison of each index of Array
            for (int i = 0; i < ArrayToString.length; i++) {
                if (ArrayToString[i].equals(stringArray[i])) {
                    System.out.println("Access Granted It !");
                    break;
                    //System.out.println("Match found at index " + i + ": " + ArrayToStringChar[i]);
                } else  {
                    System.out.println("invalid Input Access Not grated");
                    //System.out.println("No match at index " + i + ": " + ArrayToStringChar[i] + " != " + stringArray[i]);
                    break;
                }
            }
    }
}
