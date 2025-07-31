package Arrays_ArrayList;

import java.util.*;
/*
* int n = a.length;
        int j = 0; // index for next negative

        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                // swap a[i] with a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;*/
public class Neg_to_oneEnd {
    public static int[] separateNegativeAndPositive(int a[]) {
        int n=a.length;
        int insertPos=0;
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(a[i]<0){
                a[insertPos++]=a[i];
            }
            else{
                list.add(a[i]);
            }

        }
        for(int num:list){
            a[insertPos++]=num;
        }
        return a;
    }
}

// for optimal sol and neg to come first :

/*
* int n=arr.length;
        int[] temp=new int[n];
        int index=0;
        // ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[index++]=arr[i];
            }

        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[index++]=arr[i];
            }

        }


        for (int i=0;i<n;i++){
            arr[i]=temp[i];
        }*/
