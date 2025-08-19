package Leetcode_daily;
//https://leetcode.com/problems/number-of-zero-filled-subarrays/?envType=daily-question&envId=2025-08-19
public class Sliding_Window_19_8_2025 {

    class Solution {
        public long zeroFilledSubarray(int[] nums) {

            long result=0;
            long count=0;
            for(int num : nums){
                if(num==0){
                    count+=1;
                    result+=count;
                    continue;
                }
                count=0;
            }
            return result;

        }
    }
}
