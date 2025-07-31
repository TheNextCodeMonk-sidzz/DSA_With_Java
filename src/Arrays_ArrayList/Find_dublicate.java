package Arrays_ArrayList;
import java.util.HashSet;

public class Find_dublicate {


    public static int duplicateNumber(int arr[]) {
        //Your code goes here
        HashSet<Integer> seen=new HashSet<>();
        for(int num :arr){
            if(!seen.add(num)){
                return num;
            }
        }
        return -1;
    }
}

/*
* You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7*/

