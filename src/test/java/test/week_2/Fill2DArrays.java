package test.week_2;

import java.util.Random;

public class Fill2DArrays {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int cols = 5; // Number of columns
        int[][] array = new int[rows][cols];
        Random random = new Random();

        // Fill the 2D array with random integers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100); // Random integers between 0 and 99
            }
        }

        // Print the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("*****************");
        System.out.println();


        int sizerow=5;
        int sizeCol=5;
        double [][] salary=new double[sizerow][sizeCol];


         for ( int row=0;row<sizerow;row++){
             for ( int col=0;col<sizeCol;col++){
                 double salryrandom=random.nextInt(100);
                 salary[row][col]=salryrandom;
             }
         }
         for ( int i=0; i<sizerow;i++){
             for (int j=0; j<sizeCol;j++){
                 System.out.print(salary[i][j]+"  ");
             }
             System.out.println();
         }

    }


}
