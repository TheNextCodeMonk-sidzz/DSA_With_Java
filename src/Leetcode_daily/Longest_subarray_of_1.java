package Leetcode_daily;
//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/submissions/1746944217/?envType=daily-question&envId=2025-08-24
public class Longest_subarray_of_1 {
    public int longestSubarray(int[] nums) {

        int n=nums.length;

        int left=0;
        int count=0;
        int max_len=0;

        for(int right=0;right<n;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }

            max_len=Math.max(max_len, right-left);

        }
        return max_len;








        // for(int num : nums){
        //     if(num==1 && count0<2){
        //         count1++;
        //         res=res+count1;
        //     }
        //     else if(num==0){
        //         count0++;
        //     }
        //     count1=0;
        // }

        // return res;
    }

}
