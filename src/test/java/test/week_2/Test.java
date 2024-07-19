package test.week_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        char charlwer;
        char uperCase;
        int number;
        System.out.println("Enter value 1 ");
       String value= scanner.next();
        charlwer=value.charAt(0);
        System.out.println("Enter value 2 ");
        String value1= scanner.next();
        uperCase=value1.charAt(0);
        System.out.println("Enter value 3 ");
        number=scanner.nextInt();
        System.out.println("Enter value 4 ");
        String value2= scanner.next();
        charlwer=value2.charAt(0);
        System.out.println("Enter value 5 ");
        String value13= scanner.next();
        uperCase=value13.charAt(0);
        System.out.println("Enter value 6 ");
        number=scanner.nextInt();
         String []targetString=new String[6];
        targetString[0]=value;
        targetString[1]=value1;
        targetString[2]=Integer.toString(number);
        targetString[3]=value2;
        targetString[4]=value13;
        targetString[5]=Integer.toString(number);

        for( String printtargetString: targetString ){
            System.out.print(printtargetString);
        }



       // System.out.print(charlwer+"  "+uperCase+" "+number+" "+charlwer+"  "+uperCase+" "+number);
        //String unberString=Integer.toString(number);
        String [] authn=new String[6];
        authn[0]=value;
        authn[1]=value1;
        authn[2]=Integer.toString(number);
        authn[3]=value2;
        authn[4]=value13;
        authn[5]=Integer.toString(number);

        System.out.println();
        for ( String print : authn){
            System.out.print("[ " + print + " ]");
        }

        for (String element : authn) {
            if (element.equals(targetString)) {
                System.out.println("Access grated");
                break; // Exit the loop once the string is found
            }
        }
    }
}
