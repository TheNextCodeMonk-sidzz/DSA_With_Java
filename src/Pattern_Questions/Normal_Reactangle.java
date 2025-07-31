package Pattern_Questions;

import java.util.Scanner;

public class Normal_Reactangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of n :");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
