package test.week_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Class_5pm {
    public static void main(String[] args) {
        int [] number ={10,4,6,50,10,50};
    }

    public  static HashMap<Integer,ArrayList<Integer>> finalDa(int [] nuber, boolean print){

        HashMap<Integer, ArrayList<Integer>>res=new HashMap<>();
        for ( int i=0;i<nuber.length;i++){
            if ( res.containsKey(nuber[i])){
                res.get(nuber[i]).add(i);
            }
            else {
                res.put(nuber[i], new ArrayList<Integer>());
                res.get(nuber[i]).add(i);

            }

        }

        for(  int num: res.keySet()) {

           // if (res.get(num+" "))res.get(num).toString();
        }
        return res;
        }






}
