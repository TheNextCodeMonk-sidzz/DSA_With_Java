package Search_And_Sort.Searching_Techniques;

public class Find_in_rotated_array {
        public int search(int[] nums, int target) {

            int start = 0;
            int end = nums.length - 1;

            //// Step 1: Find pivot (largest element index) in rotated sorted array

            while (start < end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] > nums[end]) {
                    // Descending side
                    start= mid+1;
                } else {
                    // Ascending side
                    end=mid;
                }
            }
            int pivot=(start-1+nums.length)%nums.length;

            // Step 2: Decide which sorted half to search
            if (target >= nums[0] && target <= nums[pivot]) {
                return binarySearch(nums, target, 0, pivot);
            } else {
                return binarySearch(nums, target, pivot + 1, nums.length - 1);
            }

            // or end, both will be at the peak

        }
        /// / Standard binary search within given boundaries
        private static int binarySearch(int[] nums, int target, int left, int right) {

            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==target) return mid;
                if(nums[mid]<target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            return -1;




        }

}
