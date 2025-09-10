package Arrays_ArrayList;
//https://leetcode.com/problems/maximum-subarray/description/
public class Maximum_subarray {

    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        int max=nums[0];
        if(n==1) return nums[0];
        while(right<n){
            sum+=nums[right];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
                left=right+1;
            }
            right++;
        }
        return max;
    }
}

/*Given an integer array nums, find the subarray with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.*/
