package Pattern_Questions;

import java.util.Scanner;

public class reverse_slope_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of n :");
        int n=sc.nextInt();

        for(int i=0;i< n;i++){
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
