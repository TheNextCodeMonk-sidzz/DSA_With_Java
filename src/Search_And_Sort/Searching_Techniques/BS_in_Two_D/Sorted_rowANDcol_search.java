package Search_And_Sort.Searching_Techniques.BS_in_Two_D;

// in this que , the elements are sorted in row and column wise;
// not strictly sorted.
//also called staircase search.

import java.util.Arrays;

public class Sorted_rowANDcol_search {
    public static void main(String[] args) {
        int [][] arr={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target=10;
        int[] ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    ///  this is just a normal search as in linear search usimg matrix logic.
    static int[] Search(int[][] arr,int target){
        int row=0;
        int column = arr.length-1;
        // start from the top right corner of the matrix
        // and move left or down based on the target value
        while(row<arr.length && column >=0){
            if(arr[row][column]==target){
                return new int[] {row, column};
            }else if(arr[row][column]>target){
                column--; // move to left of the column
            }else{
                row++; // mowe toweards next row;
            }

        }
        return new int[]{-1,-1};
    }
}

///  TC =n+m or n+n= O(N);
/// sc=O(1);
