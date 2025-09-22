package Leetcode_daily;
//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2025-09-22
import java.util.HashMap;
import java.util.Map;

public class count_freq {
    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> Map = new HashMap<>();
        for (int num : nums) {
            Map.put(num, Map.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        for (int count : Map.values()) {
            maxFreq = Math.max(maxFreq, count);
        }
        int total = 0;
        for (int count : Map.values()) {
            if (count == maxFreq) {
                total += count;
            }
        }

        return total;
    }
}
