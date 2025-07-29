package Basic_Questions;

import java.sql.SQLOutput;

public class ArmStrong_number {

    static boolean isArmstrong(int num){


        int value=num;
        int digit=0;
        int sum=0;
        while(num>0){
            digit=num%10;
            sum+=(digit*digit*digit);
            num=num/10;
        }
        if(value==sum){
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args){
        // to check all Armstrong numbers
        for (int i=2;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

//        System.out.println(value);
//        System.out.println(sum);
//        if(value==sum){
//            System.out.println("True");
//        }
//        else
//            System.out.println("false");
    }
}
