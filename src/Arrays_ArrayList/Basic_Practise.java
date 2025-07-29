package Arrays_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Basic_Practise {
    public static void main(String[] args) {

        // Array of primitives
//        int [] arr= new int[4];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//
//        String strArr=new String();
//        strArr= Arrays.toString(arr);
//        // or
////        System.out.println(Arrays.toString(arr));
//        System.out.println(strArr);
        // enhanced array
//        for(int num :arr){
//            System.out.print(num+" ");
//        }
//// non primitive objects
//        String[] str=new String[5];

        /// / 2D Arrays
//        Scanner sc=new Scanner(System.in);
//        int[][] arr=new int[3][3] ;
//
//        for (int row=0; row<arr.length; row++){
//            for(int col=0; col<arr[row].length;col++){
//                arr[row][col]=sc.nextInt();
//            }
//        }

//        for (int row=0; row<arr.length; row++){
//            for(int col=0; col<arr[row].length;col++){
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for (int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }


//        int[] arr={1,2,3,4,5,6,7,8,9,11,12,25,30};
//        for(int i: arr){
//            System.out.print(i+" ");
//        }

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
