package Arrays_ArrayList;

import java.util.*;

public class Move_zeros_to_end {
    /*
    * Problem statement
Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. Return the modified array.



Example :
Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
Output: [1, 2, 2, 3, 0, 0]

Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.*/

    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        // ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<Integer> zerolist=new ArrayList<>();


        // for(int num:a){
        //     if(num==0){
        //         zerolist.add(num);
        //     }
        //     else{
        //         list.add(num);
        //     }
        // }
        // for (int num: zerolist){
        //     list.add(num);
        // }

        // return list.stream().mapToInt(i->i).toArray();

        // }

        int insertPos=0;

        for (int i=0;i<n;i++){
            if(a[i]!=0){
                a[insertPos++]=a[i];

            }

        }
        while(insertPos<n){
            a[insertPos++]=0;
        }
        return a;
    }
}
