package test.week_2;

import java.util.Random;
import java.util.Scanner;

public class AuthenticationArrayRandomGenrat {
    public static void main(String[] args) {
        int rows = 2; // Number of rows
        int cols = 2; // Number of columns
        char[] array = new char[rows];
        char[] arrayCapital= new char[rows];
        int [] arrayNumber= new int[rows];
        Random random = new Random();

        // Fill the 2D array with random lowercase letters
        for (int i = 0; i < rows; i++) {

                int number=random.nextInt(100);
                array[i] = (char) (random.nextInt(26) + 'a');
                arrayCapital[i]=(char)  (random.nextInt(26)+'A');
                //arrayNumber[i][j] = random.nextInt(100);
                arrayNumber[i]=number;

        }
        // Print the 2D array
        for (int i = 0; i < rows; i++) {

                System.out.print(array[i] + " ");
                System.out.print(arrayCapital[i] + " ");
                System.out.print(arrayNumber[i]+" ");

           // System.out.print();
        }

        var scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter First Index");
        char lowerCase= (char) scanner.nextInt();
        System.out.println("Enter Second Index");
        char uperCase=(char) scanner.nextInt();
        System.out.println("Enter Third Index");
        int inputnumber=scanner.nextInt();


        if ( array.equals(lowerCase) && arrayCapital.equals(uperCase)&&arrayNumber.equals(inputnumber)){
            System.out.println( " Access grated ");

        }
        else {
            System.out.println(" Invalid Input try Again");
        }



    }
}
