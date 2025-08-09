package Search_And_Sort.Searching_Techniques;

interface MountainArray {
    int get(int index);
    int length();
}

public class LC_Hard_find_in_mountainArr {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */

    public static void main(String[] args) {
        MountainArray mountainArr= new MountainArray() {;
            @Override
            public int get(int index) {
                // Example implementation, replace with actual logic
                int[] arr = {1, 2, 3, 4, 5, 3, 1};
                return arr[index];
            }

            @Override
            public int length() {
                return 7; // Example length
            }

        };

        int target = 3;
        int ans=findInMountainArray(target, mountainArr);
        System.out.println(ans);

    }
     static int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeakIndex(mountainArr);

        // First half: ascending
        int firstTry = agnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) return firstTry;

        // Second half: descending
        return agnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    private static int findPeakIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int midVal=mountainArr.get(mid);
            int midnextVal=mountainArr.get(mid+1);

            if (midVal > midnextVal) {
                // Descending side
                end = mid;
            } else {
                // Ascending side
                start = mid + 1;
            }
        }
        return start; // or end, both will be at the peak
    }

    // Step 2/3: Agnostic binary search
    private static int agnosticBinarySearch(MountainArray mountainArr, int target, int start, int end) {

        boolean isAsc = mountainArr.get(start)<mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVals=mountainArr.get(mid);

            if (midVals == target) return mid;

            if (isAsc) {
                if (target < midVals) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > midVals) end = mid - 1;
                else start = mid + 1;
            }
        }

        return -1;
    }

    }


