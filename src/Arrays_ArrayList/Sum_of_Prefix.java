package Arrays_ArrayList;
/*For Array A of size n, the prefix sum of A is another array P of size n+1, where P[i] represents the sum of the first i elements of A. That is,

P[0] = A[0]
P[1] = A[0] + A[1]
P[2] = A[0] + A[1] + A[2]
...
P[n-1] = A[0] + A[1] + ... + A[n-1]
You will given an array arr of length n. Your objective is to populate the output array as required, without the need to print or return anything.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1<=N<=10000
0<=arr[i]<=10000*/
public class Sum_of_Prefix {
    public static void prefixSum(int[] arr) {

        //Write your code here
        int n=arr.length;
        int[] output=new int[n];
        // for(int i=0;i<n-1;i++){
        //     output[i]=arr[i]+arr[i-1]
        // }
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            c+=a;
            arr[i]=c;
        }
    }
}
