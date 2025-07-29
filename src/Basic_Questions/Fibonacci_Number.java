package Basic_Questions;

import java.util.Scanner;

public class Fibonacci_Number {

    public static int fib(int n){

        int sum=0;
        if(n==0){
            return 0;
        }
        if(n==1) {
            return 1;
        }
        sum=fib(n-1)+fib(n-2);

        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibonacci number :");
        int n=sc.nextInt();
        System.out.println(fib(n));


//        int c=0;
//        int a=0;
//        int b=1;
//
//        for (int i =2; i<=fib;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        System.out.println("Answer : "+ c);



    }
}
