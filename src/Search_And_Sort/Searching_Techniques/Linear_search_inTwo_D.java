package Search_And_Sort.Searching_Techniques;

import java.util.Arrays;

public class Linear_search_inTwo_D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{5,7,9},{8,11,10}};
        int target=9;

        int[] ans=linear_search_in_2d(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] linear_search_in_2d(int[][] arr, int target){

        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(target==arr[i][j]){
                    return new int[]{i,j} ;
                }
            }
        }

        return new int[]{-1,-1};
    }
}


//https://leetcode.com/problems/richest-customer-wealth/description/

/*
* import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {

        int row=accounts.length;
        int col=accounts[0].length;
        int sum=0;
        int add=0;

        int res=0;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                add+=accounts[i][j];

            }
            sum=Math.max(sum,add);
            add=0;
        }

        return sum;

    }
}*/