package Hash.HashMap;

//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

import java.util.HashMap;


public class Find_Max_subsString_withSum_K {

    // User function Template for Java


        public int longestSubarray(int[] arr, int k) {
            // code here

            int prefix=0;
            int n=arr.length;
            int index=0;
            int maxLen=0;



            HashMap<Integer,Integer> map=new HashMap<>();

            while(index<n){
                prefix=prefix+arr[index];
                int subarraylen=0;

                if(prefix==k){
                    maxLen=Math.max(maxLen,index+1);;
                }
                if(map.containsKey(prefix-k)){
                    subarraylen=index-map.get(prefix-k);
                    maxLen=Math.max(maxLen,subarraylen);

                }
                if(!map.containsKey(prefix)){
                    map.put(prefix,index);
                }
                index++;

            }
            return maxLen;

        }
}



/*Longest Subarray with Sum K
Difficulty: MediumAccuracy: 24.64%Submissions: 707K+Points: 4
Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

Examples:

Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
Output: 6
Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
Output: 5
Explanation: Only subarray with sum = -5 is [-5, 8, -14, 2, 4] of length 5.
Input: arr[] = [10, -10, 20, 30], k = 5
Output: 0
Explanation: No subarray with sum = 5 is present in arr[].
Constraints:
1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104
-109 ≤ k ≤ 109

*/
