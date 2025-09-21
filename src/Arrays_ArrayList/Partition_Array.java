package Arrays_ArrayList;

import java.util.Arrays;

//https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/description/?envType=daily-question&envId=2025-09-20
public class Partition_Array {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);


        int count = 1;
        int start = nums[0];


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - start > k) {
                count++;
                start = nums[i];
            }
        }

        return count;

    }
}
