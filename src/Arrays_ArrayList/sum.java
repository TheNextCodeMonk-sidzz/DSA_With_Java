package Arrays_ArrayList;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter value at "+i+" index :");
            arr[i]=sc.nextInt();

        }
        for(int i : arr){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
