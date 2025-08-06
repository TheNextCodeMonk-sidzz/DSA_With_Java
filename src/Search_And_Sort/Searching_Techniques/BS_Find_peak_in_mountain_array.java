package Search_And_Sort.Searching_Techniques;

public class BS_Find_peak_in_mountain_array {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {

            int start=0;
            int end=arr.length-1;


            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1]){
                    end=mid; // we need to find if mid> mid+1 , so make the end =mid;
                }
                else{
                    start=mid+1; // if mid <mid+1, make start= mid+1.
                    // so at last both condition will check for max mid and stop when start>=end.
                    // that point our start is pointing to end (cuz start =mid+1)
                }
            }
            return start;

        }
    }
}
