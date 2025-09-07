package Leetcode_daily;
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=daily-question&envId=2025-09-07
public class N_unique_Numbers_sum_to_zero {

    public int[] sumZero(int n) {

        int[] arr=new int[n];
        int index=0;

        if(n%2==0){
            for(int i=1;i<=n/2;i++){
                arr[index++]=i;
                arr[index++]=-i;
            }
        }else{
            arr[0]=0;
            for(int i=1;i<=n/2;i++){
                arr[index++]=i;
                arr[index++]=-i;
            }
        }

        return arr;
    }
}

/*
* Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]*/
