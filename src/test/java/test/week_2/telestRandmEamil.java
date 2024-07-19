package test.week_2;

import java.util.Random;

public class telestRandmEamil {
    public static void main(String[] args) {


     double radom=Math.random();
     int number= (int)(radom*1000);
        System.out.println(number);
        String emailname="saeed.faki";
        System.out.println(emailname+number+"@gmail.com");

        Random ransom1= new Random();
        int numb=ransom1.nextInt(300-1)+1;

        System.out.println(emailname+numb+"@gmail.com");


        // Generate a random character from the custom set
        //char randomChar = characters.charAt(random.nextInt(characters.length()));
        //System.out.println("Random Character: " + randomChar);


    }



}
