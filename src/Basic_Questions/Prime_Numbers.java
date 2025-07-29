package Basic_Questions;

import java.util.Scanner;

public class Prime_Numbers {

    public static void prime_numbers(int n){
//        int c=2;
//        int value=(int) Math.sqrt(n);
//        while(c<value){
//            if(n%c==0) {
//                System.out.println("Not a prime number");
//                return;
//            }
//            c+=1;
//        }
//        System.out.println("It is a prime number ");

        boolean isPrime=true;
        for(int i=2;i<n;i++)
            if(n%i==0)
                isPrime=false;
        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("not prime");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number= sc.nextInt();

        prime_numbers(number);
    }
}
