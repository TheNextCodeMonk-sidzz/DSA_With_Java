package Basic_Questions;

import java.util.Scanner;

public class Swap_numbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int a=sc.nextInt();
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);

    }
}
