package Arrays_ArrayList;
import java.util.*;
public class Reverse_array_Indices {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.

        while(l < r){
            swap(arr, l, r);
            l++;
            r--;
        }
        return arr;
    }
}
/*
* Given an array ‘ARR’ of size ‘N’. You are also given two indices ‘L’ and ‘R’.

Your task is to reverse the ‘ARR’ from index ‘L’ to ‘R’ inclusive.

Example:
Input:
‘N’ = 3 ‘L’ = 0 ‘R’ = 1 ‘ARR’ = [1, 2, 3]


Output:
2 1 3

Explanation:

When we reverse the elements between indices 0 and 1 we get the array as 2 1 3.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= T <= 10
1  <= N <= 100000
0 <= L, R < N
1 <= ARR[i] <= 1e9
Time Limit: 1 sec
Sample Input 1:
2
3
0 1
1 2 3
2
0 1
1 2*/
