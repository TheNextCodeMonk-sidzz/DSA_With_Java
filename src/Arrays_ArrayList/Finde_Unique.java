package Arrays_ArrayList;


//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//
//You need to find and return that number which is unique in the array/list.
//
// Note:
//Unique element is always present in the array/list according to the given condition.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//2 3 1 6 3 6 2
//Sample Output 1:
//1
public class Finde_Unique {
    public static int findUnique(int[] arr){
        //Your code goes here
        int n=arr.length;
        int res=0;
        for(int num:arr){
            res ^=num;
        }
        return res;
    }
}
