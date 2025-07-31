package Pattern_Questions;

import java.util.Scanner;

public class Star_pattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println("");
        }

    }
}
