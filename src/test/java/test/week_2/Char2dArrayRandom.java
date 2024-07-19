package test.week_2;

import java.util.Random;
import java.util.Scanner;

public class Char2dArrayRandom {
    public static void main(String[] args) {
        int rows = 2; // Number of rows
        int cols = 2; // Number of columns
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
            System.out.println();
        }

    }
}
