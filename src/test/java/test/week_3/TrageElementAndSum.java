package test.week_3;

public class TrageElementAndSum {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,8,9};
        int target=9;

        for ( int i=1;i<number.length;i++){
            if(number[i]+number[i-1]==target){
                System.out.println(number[i-1]);
                break;
            }
        }
    }
}
